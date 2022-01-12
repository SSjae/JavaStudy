package day02;

public class OperatorEx2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		++x;
		x++;	// 단독으로 사용할 경우 전위, 후위 상관 없음
		System.out.println("x : " + x); // 12
		System.out.println("========================");
		x = 10;
		System.out.println("후위 증가 연산 x++ : " + (x++));	// 10
		System.out.println("x : " + x);					// 11

		System.out.println("전위 증가 연산 ++y : " + (++y));	// 11
		System.out.println("y : " + y);					// 11
		
		x = 10;
		int result = x++;
		System.out.println("result : " + result);		//10
		System.out.println("x : " + x);					//11
		/*
		 * 	int result = x++;
		 * 	->	result = x;
		 * 	->	x++;
		 */
	}
}
