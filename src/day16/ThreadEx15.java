package day16;

public class ThreadEx15 {
	public static void main(String[] args) {
		ThreadEx15_1 gc = new ThreadEx15_1();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for(int i = 0; i < 20; i++) {
			requiredMemory = (int)(Math.random() * 10) * 20;
			
			System.out.println(requiredMemory);
			// �ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ũ�ų� ��ü �޸𸮰� 60%�̻��� ������� ��� gc�� �����.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt(); // gc�� �ٷ� ����� ���
				try {
					gc.join(100); // gc()�� ����� �� �ֵ��� main�����尡 0.1�� ��ٸ�
				} catch (InterruptedException e) {}
			}
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory : " + gc.usedMemory);
		}
	}
}


class ThreadEx15_1 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	@Override
	public void run() {
		while(true) { // ���󾲷���(daemon thread)
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				// 1. sleep�� ����� �� InterruptedException �߻�
				// 2. Interrupt�༭ InterruptedException �߻�
				System.out.println("Awaken by interrupt()");
			}
			gc();
			System.out.println("Garbage Collected. Free Memory : " + freeMemory());
		}
	}
	
	public void gc() { // �������÷���(Garbage Collector)�� �����ϴ� �޼ҵ�
		usedMemory -= 300; // �޸� ����Ȯ��
		if(usedMemory < 0) {
			usedMemory = 0;
		}
	}
	
	public int totalMemory() { // �ִ� ����� �� �ִ� �޸� ���� ��ȯ�ϴ� �޼ҵ�
		return MAX_MEMORY;
	}
	
	public int freeMemory() { // ���� ����� �� �ִ� �޸� ���� ��ȯ�ϴ� �޼ҵ�
		return MAX_MEMORY - usedMemory;
	}
}