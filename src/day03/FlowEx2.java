package day03;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		System.out.println("숫자를 하나 입력하세요 > ");
		
		Scanner sc = new Scanner(System.in);
		// 1. String오르 입력받고 Integer.parseInt사용하기
//		String tmp = sc.nextLine();
//		input = Integer.parseInt(tmp);
		
		// 2. 바로 int로 받는 방법
		input = sc.nextInt();
	
		if ( input == 0 ) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자 : " + input);
		}
	}
}
