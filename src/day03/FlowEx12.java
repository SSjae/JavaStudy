package day03;

import java.util.Scanner;

public class FlowEx12 {

	public static void main(String[] args) {
		// �� �ڸ����� �� ���ϱ�
		// 12345 ==> 1 + 2 + 3 + 4 + 5 == 15
		
		int num = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� ( ��:12345 ) > ");
		num = sc.nextInt();
		
		while ( num != 0 ) {
			sum += num % 10;	// 12345 % 10 = 5
			System.out.println("sum : " + sum);
			
			num /= 10; // 12345 / 10 == 1234
			System.out.println("num : " + num);
			System.out.println();
		}
		System.out.println("�� �ڸ����� �� : " + sum);
	}
}
