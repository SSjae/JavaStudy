package day03;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		switch( num ) {
			case 1:
				System.out.println("num�� 1�Դϴ�.");
				break;
			case 2:
				System.out.println("num�� 2�Դϴ�.");
				break;
			case 3:
				System.out.println("num�� 3�Դϴ�.");
				break;
			default :
				System.out.println("num�� 1, 2, 3�� �ƴմϴ�.");	
		}
	}
}
