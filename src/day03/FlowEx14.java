package day03;

import java.util.Scanner;

public class FlowEx14 {

	public static void main(String[] args) {
		/*
		 *	Math.random()
		 * 	0.0 <= Math.random() < 0.1
		 * 	0.0 * 100 <= Math.random * 100 < 1.0 * 100
		 * 	0.0 <= Math.random < 100.0
		 * 	(int)0.0 <= (int)Math.random < (int)100.0
		 * 	0 <= (int)Math.random < 100
		 * 	1 <= (int)Math.random < 101
		 */
		
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : " + answer);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� > ");
			input = sc.nextInt();
			
			if(input < answer) {
				System.out.println("�� ū���� �õ��غ�����.");
			}else if(input > answer) {
				System.out.println("�� �������� �õ��غ�����.");
			}
		}while(input != answer);
		System.out.println("�����Դϴ�!!!!");
	}
}
