package day02;

public class OperatorEx1 {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		int result = 0;
		
		result = v1 + v2;
		System.out.println("���ϱ� ��� : " + result); // 7
		System.out.println("���ϱ� ��� : " + v1 + v2); // 52
		System.out.println("���ϱ� ��� : " + (v1 + v2)); // 7
		
		result = v1 - v2;
		System.out.println("���� ��� : " + result); // 3
		
		result = v1 / v2;
		System.out.println("������ ��� : " + result); // 2
		
		result = v1 % v2;
		System.out.println("������ ��� : " + result); // 1
		
	}

}
