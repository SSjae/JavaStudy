package day05;

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("=====�⺻�� �Ű�����=====");
		System.out.println("main() : " + d.x); // 10
		change1(d.x);	// �޼ҵ� �������� �ٲ�
		System.out.println("main() : " + d.x); // 10, ���� ���� �ٲ��� ����
		

		System.out.println("\n=====������ �Ű�����=====");
		System.out.println("main() : " + d.x); // 10
		change2(d);		// �ּ�( ��ü ��ü )�� ���� ������ ���� ���� �ٲ�
		System.out.println("main() : " + d.x); // 1000, ���� ���� �ٲ�
	}
	
	static void change1(int x) { // int x = 10; �⺻�� �Ű�����
		x = 1000;
		System.out.println("change1() : " + x);
	}
	
	static void change2(Data d) { // Data d = new Data(); ������ �Ű�����
		d.x = 1000;
		System.out.println("change2() : " + d.x);
	}
}
