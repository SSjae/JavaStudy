package day01;

public class VarEx1 {

	public static void main(String[] args) {
		// ������ ����� �ʱ�ȭ
		int x = 10;
		int y = 20;
		int tmp = 0;
				
		// �� �� �ּ�( ������ �ִ� ���� ) : ctrl + / 
//		System.out.println(x);
//		System.out.println(y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("=====================");
		// ���� + ���ڿ� ==> ���ڿ�
		// ���ڿ� + ���� ==> ���ڿ�
		// ���ڿ� + ���ڿ� ==> ���ڿ�
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
