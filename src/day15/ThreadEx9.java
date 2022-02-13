package day15;

public class ThreadEx9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();
		
		th1.start();
		th2.start();
		
		try {
			// sleep�� static�̶� ȣ���� �����带 ����.
//			th1.sleep(2000); // �̷��� ����, static�� Ŭ����, �������� �Ѵ� ���� ���� �ϱ� ������ ����
			Thread.sleep(2000); // main�� �����
		} catch (Exception e) {}
		System.out.println("<<main����>>");
	}
}

class ThreadEx9_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 ����>>");
	}
}

class ThreadEx9_2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("<<th2 ����>>");
	}
}