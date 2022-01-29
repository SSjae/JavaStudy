package day10;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
			if(e instanceof ArithmeticException) { // ArithmeticException e = new ArithmeticException();
				System.out.println("true");
			}
		} catch (Exception e) { // Exception은 맨 마지막으로 해야함, 어차피 부모라 다 걸림 그래서 맨 마지막
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
