package day15;

import javax.swing.JOptionPane;

public class ThreadEx5 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값 : " + input);
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초동안 재움 (텀을 두고 출력)
			} catch (Exception e) {}
		}
	}
}