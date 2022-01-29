package day10;

public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println("예외 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}