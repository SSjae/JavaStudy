package day16;

import javax.swing.JOptionPane;

public class ThreadEx11 {
	public static void main(String[] args) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값 : " + input);
		
		th1.interrupt();
		// interrupt()를 호출하면 interrupted()상태가 true가 된다.
		System.out.println("main쓰레드에서 th1.isInterrupted() 출력 : " + th1.isInterrupted());
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
			// sleep()으로 깨어난 쓰레드는 interrupted상태를 false로 초기화시킴
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}
