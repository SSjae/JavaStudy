package day16;

public class ThreadEx14 {
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.join();	// 현재 실행중인 쓰레드가 th1이 끝날때까지 기다린다.
			//th2.join();	// 현재 실행중인 쓰레드가 th2가 끝날때까지 기다린다.
		} catch (Exception e) {}
		System.out.println("<<main종료>>");
	}
}

class ThreadEx14_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx14_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}