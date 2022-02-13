package day16;

public class ThreadEx14 {
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		ThreadEx14_2 th2 = new ThreadEx14_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.join();	// ���� �������� �����尡 th1�� ���������� ��ٸ���.
			//th2.join();	// ���� �������� �����尡 th2�� ���������� ��ٸ���.
		} catch (Exception e) {}
		System.out.println("<<main����>>");
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