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
			System.out.println("method1�޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
}
