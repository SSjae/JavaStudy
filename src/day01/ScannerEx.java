package day01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// Scanner 클래스 이요
		// ==> 입력을 받기 위한 클래스이다.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 입력 > ");
//		int num = sc.nextInt(); // 정수를 입력 받음.
//		System.out.println("사용자로부터 입력받은 숫자 : " + num);
		
//		System.out.println("실수 입력 > ");
//		double dnum = sc.nextDouble(); // 실수를 입력 받음.
//		System.out.println("사용자로부터 입력받은 숫자(실수) : " + dnum);
		
		// 문자열 받기 ==> next(), nextLine()
//		System.out.println("문자열 입력 > ");
//		String str = sc.next(); // 공백을 기준으로 문자열을 입력받음.
//		System.out.println("입력받은 문자열 : " + str);
	
//		System.out.println("문자열 입력 > ");
//		String str2 = sc.nextLine(); // 공백에 상관없이 다 받음
//		System.out.println("입력받은 문자열 : " + str2);
		
//		System.out.println("숫자를 입력하세요 > ");
//		String str3 = sc.nextLine();
//		System.out.println("입력받은 숫자 : " + str3);
//		
//		int result = Integer.parseInt(str3); // 문자열 -> 정수로 바꾸는 메소드
//		result += 2;
//		System.out.println("result : " + result);
		
		String jumin = "020311-3456789";
		// index
		/*
		 *		String str = "abc";
		 *
		 *				a	b	c
		 *		index	0	1	2
		 */
		
		char gender = jumin.charAt(7);	// charAt(int index) 문자열에서 특정 위치의 문자를 추출하는 메소드
		System.out.println("gender : " + gender);
	}

}
