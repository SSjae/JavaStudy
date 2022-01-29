package day10;

public class ExceptionEx11 {
	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메소드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
}
