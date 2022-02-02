package day11;

import java.util.Scanner;

public class ObjTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println(msg1 == msg2);
		// String�� Ŭ�����̱� ������ msg1, msg2�� ���������̴�. �׷��� ���� �ƴ϶� �ּ� ������ ����Ű�� �ּ� ���� ���Ѵ�.
		// msg1, msg2�� ���� ��� Hello�̱⿡ ���� ������ ����Ų��. �׷��� true�� �ȴ�.
		
		String msg3 = "Hello";
//		String msg4 = sc.next();
		String msg5 = new String("Hello");
//		System.out.println(msg3 == msg4);
//		System.out.println(msg3.equals(msg4));
		// msg3�� Hello�̱� ������ ���� ������ ����Ű���� msg4�� ���� ���� �پ��ϱ� ������
		// �ٸ� �ʵ忡�� ��������� �ٸ� �ּҸ� ����Ű�� ������ false�� �ȴ�.
		// �׷��� ���� ���ϱ� ������ equals�� ����Ѵ�.
		
		// equals�� ���� ObjectŬ������ �޼ҵ��̿��� ���캸�� ==�̶� �ٸ��� ����.
		// ������ String�� �̰��� ���������ֱ� ������ ���� �񱳰� �����ϴ�.
		// �� ���� ��, String�� Object�� �ڽ��̴�.
//		--------------------------------------------------------------------------------------------------------
		// ������ü : ���� �ִ� ���� ���� ��ü..
		Test obj1 = new Test(10, "Hello");
		Test obj2 = new Test(10, "Hello");
		
		// toString()
		System.out.println(obj1);
		// println �޼ҵ忡�� toString�� ���ֱ� ������ �Ȱ���.
		// �⺻���� �� ��ü�� �ּҰ��̴�.
		System.out.println(obj1.toString());
		
		// equals()
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1.equals(obj2)); // true : �������� �޼ҵ�� �ϱ� ������ true
		// �⺻�����δ� == �̱� ������ �ٸ��ɷ� ���´�.
		// ��ü�鳢�� ���� ����ҷ��� �츮�� �����Ǹ� ����� �Ѵ�.
		
		// hashCode() : �ּ� ���� Ư���� ������ ���� ������ ��ȯ�� ��
		// �ּҴ� �ٸ��� ������ hashCode()�� �翬�� �ٸ�, �׷��� ������ �ʿ�
		// �ؽ��ڵ���� ���� ������� ���� ��ü��� �ڹٰ� �ν���
		System.out.println(obj1.hashCode() == obj2.hashCode());
	}
}

class Test {
	int intData;
	String strData;
	
	public Test(int intData, String strData) {
		this.intData = intData;
		this.strData = strData;
	}
	
	@Override
	public String toString() {
		return "���� : " + intData + " /  ���ڿ� : " + strData;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj�� �ڽ��� ������� ������� ���ϱ� ������ ����� �� �ֵ��� ����� �Ѵ�.(downCasting���� ��ȯ)
		// 1. Ÿ�Ժ�
		if(obj instanceof Test) {
			// 2.�ٿ�ĳ����
			Test target = (Test) obj;
			// 3.���Ǻ�
			if (this.intData == target.intData && this.strData.equals(target.strData)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return intData + strData.length();
	}
}
