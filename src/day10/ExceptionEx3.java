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
			} catch (Exception e) { // Exception e = new ArithmeticException(); ( ������ )
				System.out.println("0���� ������ ���ܰ� �߻��߽��ϴ�.");
			}
		}
		System.out.println("for���� ���������� ����Ǿ����ϴ�.");
	}
}
