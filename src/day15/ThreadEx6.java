package day15;

import javax.swing.JOptionPane;

public class ThreadEx6 {
	public static void main(String[] args) {
		ThreadEx6_1 t1 = new ThreadEx6_1();
		t1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값 : " + input);
	}
}

class ThreadEx6_1 extends Thread {
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}