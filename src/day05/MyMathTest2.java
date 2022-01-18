package day05;

public class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(5, 3));
		System.out.println(MyMath2.substract(5, 3));
		System.out.println(MyMath2.multiply(5, 3));
		System.out.println(MyMath2.divide(5, 3));
		int result = MyMath2.add(10, 15);
		System.out.println(result); // 25
	}
}

class MyMath2 {
	static int add(int a, int b) { // µ¡¼À ¸Þ¼Òµå
		int result = a + b;
		return result; // result = a + b;
	}
	
	static int substract(int a, int b) { // »¬¼À ¸Þ¼Òµå
		return a - b;
	}
	
	static int multiply(int a, int b) { // °ö¼À ¸Þ¼Òµå
		return a * b;
	}
	
	static double divide(double a, double b) { // ³ª´°¼À ¸Þ¼Òµå
		return a / b;
	}
}
