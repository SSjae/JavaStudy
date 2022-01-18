package day05;

public class MyMathTest1 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		int result1 = mm.add(5, 3);
		int result2 = mm.substract(5, 3);
		int result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		// double a = 5, double b = 3;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}
}
