package day16;

import javax.swing.JOptionPane;

public class ThreadEx10 {
	public static void main(String[] args) {
		ThreadEx10_1 th1 = new ThreadEx10_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값 : " + input);
		
		th1.interrupt();
		// interrupt()를 호출하면 interrupted()상태가 true가 된다.
		System.out.println("main쓰레드에서 th1.isInterrupted() : " + th1.isInterrupted());
	}
}

class ThreadEx10_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) { // isInterrupted == false이고 i가 0이 아니어야 while문이 동작한다.
			System.out.println(i--);
			for(long x = 0; x < 5000000000L; x++); // 0이 17개, 시간지연이 목적
			// sleep으로 꺠어난 쓰레드는 inturrupted를 false로 초기화 해주기 떄문에 sleep으로 안함
			System.out.println("!isInterrupted() : " + !isInterrupted());
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}