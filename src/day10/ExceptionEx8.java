package day10;

public class ExceptionEx8 {
	public static void main(String[] args) {
		try {
//			Exception e = new Exception("���Ƿ� �߻�������");
//			throw e;
//			ArithmeticException e = new ArithmeticException();
//			throw e;
			throw new Exception("���Ƿ� �߻�������");
		} catch (ArithmeticException e) {
			// ArithmeticException e = new ArithmeticException(); ( x )
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			// Exception e = new Exception();
			System.out.println("Exception");
			System.out.println("���ܸ޽��� : " + e.getMessage());
			e.printStackTrace();
		}
	}
}