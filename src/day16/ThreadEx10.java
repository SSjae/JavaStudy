package day16;

import javax.swing.JOptionPane;

public class ThreadEx10 {
	public static void main(String[] args) {
		ThreadEx10_1 th1 = new ThreadEx10_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� �� : " + input);
		
		th1.interrupt();
		// interrupt()�� ȣ���ϸ� interrupted()���°� true�� �ȴ�.
		System.out.println("main�����忡�� th1.isInterrupted() : " + th1.isInterrupted());
	}
}

class ThreadEx10_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) { // isInterrupted == false�̰� i�� 0�� �ƴϾ�� while���� �����Ѵ�.
			System.out.println(i--);
			for(long x = 0; x < 5000000000L; x++); // 0�� 17��, �ð������� ����
			// sleep���� �ƾ ������� inturrupted�� false�� �ʱ�ȭ ���ֱ� ������ sleep���� ����
			System.out.println("!isInterrupted() : " + !isInterrupted());
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}