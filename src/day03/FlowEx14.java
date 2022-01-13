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
		answer = (int)(Math.random() * 100) + 1; // 1~100까지의 랜덤한 숫자
		Scanner sc = new Scanner(System.in);
		System.out.println("정답 : " + answer);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요 > ");
			input = sc.nextInt();
			
			if(input < answer) {
				System.out.println("더 큰수로 시도해보세요.");
			}else if(input > answer) {
				System.out.println("더 작은수로 시도해보세요.");
			}
		}while(input != answer);
		System.out.println("정답입니다!!!!");
	}
}
