package day10;

public class ExceptionEx10 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main���� ����ó��");
		}
	}
	
	static void method1() throws Exception {
		method2();
	}
	
//	static void method2() throws Exception {
//	static void method2() throws ArithmeticException { // ���� �� üũ �ʿ�!!
	static void method2() throws Exception {
		throw new ArithmeticException();
	}
}
