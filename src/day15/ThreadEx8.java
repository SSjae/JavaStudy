package day15;

public class ThreadEx8 implements Runnable {
	
	static boolean autoSave = false;
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			if(autoSave) {
				autoSave();
			}
		}	
	}
	
	public void autoSave() {
		System.out.println("�۾������� ����Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
//		Runnable r = new ThreadEx8();
//		Thread t = new Thread(r);
		
		// �� ������ ���ٷ� �ٲ㺸��
		Thread t = new Thread(new ThreadEx8());
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
			System.out.println(i);
			if(i == 5) {
				autoSave = true;
			}
		}
	}
}
