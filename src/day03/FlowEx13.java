package day03;

import java.util.Scanner;

public class FlowEx13 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) { // while(true)
			System.out.print("�հ踦 ���� ���ڸ� �Է��ϼ���(����� 0) > ");
			num = sc.nextInt();
			
			if ( num != 0 ) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println("�հ� : " + sum);
	}
}
