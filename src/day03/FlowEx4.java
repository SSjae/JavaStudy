package day03;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ��� > ");
		score = sc.nextInt();
		
		if ( score >= 90 ) {
			grade = 'A';
			if ( score >= 98 ) {
				opt = '+';
			} else if ( score < 94 ) {
				opt = '-';
			}
		} else if ( score >= 80 ) {
			grade = 'B';
			if ( score >= 88 ) {
				opt = '+';
			} else if ( score < 84 ) {
				opt = '-';
			}
		} else if ( score >= 70 ) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println( "����� ���� : " + grade + opt);
	}
}
