package day02;

public class OperatorEx1 {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		int result = 0;
		
		result = v1 + v2;
		System.out.println("더하기 결과 : " + result); // 7
		System.out.println("더하기 결과 : " + v1 + v2); // 52
		System.out.println("더하기 결과 : " + (v1 + v2)); // 7
		
		result = v1 - v2;
		System.out.println("빼기 결과 : " + result); // 3
		
		result = v1 / v2;
		System.out.println("나누기 결과 : " + result); // 2
		
		result = v1 % v2;
		System.out.println("나머지 결과 : " + result); // 1
		
	}

}
