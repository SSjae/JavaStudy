package day02;

public class OperatorEx7 {

	public static void main(String[] args) {
		// 복합대입연산자
		int result = 0;
		
		result += 10;	// result = result + 10
		System.out.println("result : " + result);	// 10
		
		result -= 5;	// result = result - 10
		System.out.println("result : " + result);	// 5
		
		result *= 5;	// result = result * 10
		System.out.println("result : " + result);	// 25
		
		result /= 5;	// result = result / 10
		System.out.println("result : " + result);	// 5
		
		result %= 5;	// result = result % 10
		System.out.println("result : " + result);	// 0
	}
}
