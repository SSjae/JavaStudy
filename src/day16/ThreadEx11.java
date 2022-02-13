package day16;

import javax.swing.JOptionPane;

public class ThreadEx11 {
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� �� : " + input);
		
		th1.interrupt();
		// interrupt()�� ȣ���ϸ� interrupted()���°� true�� �ȴ�.
		System.out.println("main�����忡�� th1.isInterrupted() ��� : " + th1.isInterrupted());
	}
}

class ThreadEx11_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
				System.out.println("!isInterrupted() : " + !isInterrupted());
			} catch (InterruptedException e) {}
			// sleep()���� ��� ������� interrupted���¸� false�� �ʱ�ȭ��Ŵ
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
