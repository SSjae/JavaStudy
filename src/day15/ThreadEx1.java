package day15;

public class ThreadEx1 {
	public static void main(String[] args) {
		// 1. Thread 클래스를 상속받은 Thread의 객체생성
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		// 2. Runnable 인터페이스를 구현한 Thread의 객체생성
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		// 실행 - start();
		t1.start();
		t2.start();
	}
}

// 1. Thread 클래스를 상속받아서 Thread를 생성
class ThreadEx1_1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("ThreadEx1_1");
		}
	}
}

// 2. Runnable 인터페이스를 구현한 Thread 생성
class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("ThreadEx1_2");
		}
	}
}