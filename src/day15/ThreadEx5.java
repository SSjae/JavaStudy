package day15;

import javax.swing.JOptionPane;

public class ThreadEx5 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� �� : " + input);
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1�ʵ��� ��� (���� �ΰ� ���)
			} catch (Exception e) {}
		}
	}
}