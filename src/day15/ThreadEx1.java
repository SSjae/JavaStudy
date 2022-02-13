package day15;

public class ThreadEx1 {
	public static void main(String[] args) {
		// 1. Thread Ŭ������ ��ӹ��� Thread�� ��ü����
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		// 2. Runnable �������̽��� ������ Thread�� ��ü����
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		// ���� - start();
		t1.start();
		t2.start();
	}
}

// 1. Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ����
class ThreadEx1_1 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("ThreadEx1_1");
		}
	}
}

// 2. Runnable �������̽��� ������ Thread ����
class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("ThreadEx1_2");
		}
	}
}