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
		System.out.println("작업파일이 저장되었습니다.");
	}
	
	public static void main(String[] args) {
//		Runnable r = new ThreadEx8();
//		Thread t = new Thread(r);
		
		// 위 두줄을 한줄로 바꿔보기
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
