package day02;

public class OperatorEx2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		++x;
		x++;	// �ܵ����� ����� ��� ����, ���� ��� ����
		System.out.println("x : " + x); // 12
		System.out.println("========================");
		x = 10;
		System.out.println("���� ���� ���� x++ : " + (x++));	// 10
		System.out.println("x : " + x);					// 11

		System.out.println("���� ���� ���� ++y : " + (++y));	// 11
		System.out.println("y : " + y);					// 11
		
		x = 10;
		int result = x++;
		System.out.println("result : " + result);		//10
		System.out.println("x : " + x);					//11
		/*
		 * 	int result = x++;
		 * 	->	result = x;
		 * 	->	x++;
		 */
	}
}
