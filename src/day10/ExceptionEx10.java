package day10;

public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main에서 예외처리");
		}
	}
	
	static void method1() throws Exception {
		method2();
	}
	
//	static void method2() throws Exception {
//	static void method2() throws ArithmeticException { // 범위 잘 체크 필요!!
	static void method2() throws Exception {
		throw new ArithmeticException();
	}
}
