package day10;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 20; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println("result : " + result);
//			} catch (ArithmeticException e) {
			} catch (Exception e) { // Exception e = new ArithmeticException(); ( 다형성 )
				System.out.println("0으로 나눠서 예외가 발생했습니다.");
			}
		}
		System.out.println("for문이 정상적으로 종료되었습니다.");
	}
}
