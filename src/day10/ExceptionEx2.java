package day10;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 100; i++) { // 반복횟수 : 100번
			result = number / (int)(Math.random() * 10);
			// (int)(Math.random() * 10) 범위 : 0 ~ 9
			System.out.println("result : " + result);
			// 예외발생 인스턴스 : new ArithmeticException();
		}
		
		System.out.println("for문이 정상적으로 종료되었습니다.");
	}
}
