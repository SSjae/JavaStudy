package day02;

import java.util.Scanner;

public class OperatorEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ��� > ");
		int score = sc.nextInt();
		
		char grade = ( score >= 90 ) ? 'A' : 'B';
		System.out.println("����� ����� : "  + grade);
		
		grade = ( score >= 90 ) ? 'A' : ( ( score >= 80 ) ? 'B' : 'C' );
		System.out.println("����� ��������� : "  + grade);
	}
}