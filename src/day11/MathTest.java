package day11;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		// Math.random() : 0.0 ~ 1.0 사이에 랜덤한 실수 반환(double)
		int data = (int)(Math.random() * 10 + 1); // 1 ~ 10
		System.out.println(data);
		
		// 랜덤 클래스
		Random r = new Random();
		System.out.println(r.nextInt(10) + 1); // : 1 ~ 10까지의 랜덤한 정수
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Math.round(실수) : 소수점 첫째자리에서 반올림
//		double test = 21.1118090030;
//		System.out.println(Math.round(test));
//		// 넷째자리에서 반올림 하고 싶을 떄
//		// 1. 1000(10의 3승) 곱하기
//		// test * 1000 --> 21111.8090030
//		// 2. 반올림(Math.round())
//		// Math.round(21111.8090030) --> 21112
//		// 3. 다시 1000.0으로 나누기
//		// 21112 / 1000.0 --> 21.112
//		System.out.println( Math.round(test * 1000) / 1000.0 );
		
//		
//		// Math.ceil(실수) : 올림
//		System.out.println(Math.ceil(1.1));
//		// Math.floor(실수) : 내림
//		System.out.println(Math.floor(1.9999));
//		
//		
//		// Math.abs(값) : 절대값
//		System.out.println(Math.abs(-418974));
//		
//		
//		// Math.pow(n,m) : n의 m제곱
//		System.out.println(Math.pow(10, 3));
	}
}
