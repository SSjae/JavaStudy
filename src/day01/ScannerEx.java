package day01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// Scanner Ŭ���� �̿�
		// ==> �Է��� �ޱ� ���� Ŭ�����̴�.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("���� �Է� > ");
//		int num = sc.nextInt(); // ������ �Է� ����.
//		System.out.println("����ڷκ��� �Է¹��� ���� : " + num);
		
//		System.out.println("�Ǽ� �Է� > ");
//		double dnum = sc.nextDouble(); // �Ǽ��� �Է� ����.
//		System.out.println("����ڷκ��� �Է¹��� ����(�Ǽ�) : " + dnum);
		
		// ���ڿ� �ޱ� ==> next(), nextLine()
//		System.out.println("���ڿ� �Է� > ");
//		String str = sc.next(); // ������ �������� ���ڿ��� �Է¹���.
//		System.out.println("�Է¹��� ���ڿ� : " + str);
	
//		System.out.println("���ڿ� �Է� > ");
//		String str2 = sc.nextLine(); // ���鿡 ������� �� ����
//		System.out.println("�Է¹��� ���ڿ� : " + str2);
		
//		System.out.println("���ڸ� �Է��ϼ��� > ");
//		String str3 = sc.nextLine();
//		System.out.println("�Է¹��� ���� : " + str3);
//		
//		int result = Integer.parseInt(str3); // ���ڿ� -> ������ �ٲٴ� �޼ҵ�
//		result += 2;
//		System.out.println("result : " + result);
		
		String jumin = "020311-3456789";
		// index
		/*
		 *		String str = "abc";
		 *
		 *				a	b	c
		 *		index	0	1	2
		 */
		
		char gender = jumin.charAt(7);	// charAt(int index) ���ڿ����� Ư�� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
		System.out.println("gender : " + gender);
	}

}
