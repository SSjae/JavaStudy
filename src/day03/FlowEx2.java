package day03;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		System.out.println("���ڸ� �ϳ� �Է��ϼ��� > ");
		
		Scanner sc = new Scanner(System.in);
		// 1. String���� �Է¹ް� Integer.parseInt����ϱ�
//		String tmp = sc.nextLine();
//		input = Integer.parseInt(tmp);
		
		// 2. �ٷ� int�� �޴� ���
		input = sc.nextInt();
	
		if ( input == 0 ) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���� : " + input);
		}
	}
}
