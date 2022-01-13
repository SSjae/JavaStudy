package day03;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수를 입력하세요 > ");
		score = sc.nextInt();
		
		switch ( score / 10 ) { // 많은 수를 몫으로 case를 구분해서 출력
			case 10 :
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'D';
		}
		System.out.println("당신의 학점 : " + grade);
	}
}
