package day02;

public class OperatorEx6 {

	public static void main(String[] args) {
		boolean result = false;
		int i = 10;
		char ch = 'b'; // 98
		
		result = ( i > 5 ); // true
		System.out.println("(i > 5) : " + ( i > 5 ));
		
		result = ( i >= 9 ) && ( i < -8 ); // false
		System.out.println("( i >= 9 ) && ( i < -8 ) : " + result);
		
		result = ( i >= 9 ) || ( i < -8 ); // true
		System.out.println("( i >= 9 ) || ( i < -8 ) : " + result);
		
		/*
		 *	A : 65
		 *	Z : 90
		 *	a : 97
		 *	z : 122
		 */
		
		result = ( ch >= 'a' && ch <= 'z' ); // �ҹ������� Ȯ���ϴ� ���ǹ�. true
		System.out.println("( ch >= 'a' && ch <= 'z' ) : " + result);
		
		result = ( ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z'); // �ش繮�ڰ� ���ĺ����� Ȯ���ϴ� ���ǹ� true
//		result = ( ch >= 'a' && ch <= 'z') && ( ch >= 'A' && ch <= 'Z'); // false
		System.out.println("���ĺ� ���� : " + result);
	}
}