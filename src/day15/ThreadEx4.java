package day15;

public class ThreadEx4 {
	public static void main(String[] args) {
		// ��Ƽ������ �ҿ�ð� Ȯ��, �۾���ȯ(context switching)
		// �Դ� ���� �ϸ鼭 ��Ƽ�� ����
		
		ThreadEx4_1 t1 = new ThreadEx4_1();
		t1.start();
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("�ҿ�ð�1 : " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx4_1 extends Thread {
	long threadEx4StartTime = System.currentTimeMillis();
	
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("�ҿ�ð�2 : " + (System.currentTimeMillis() - threadEx4StartTime));
	}
}