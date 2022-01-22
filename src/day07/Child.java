package day07;

public class Child extends Parent {
	public static void main(String[] args) {
		
		/*
		 * 	child() {
		 * 		super(){} // �θ� �ƹ� �������� �� ������ ���� ���� �ڵ������� �߰�
		 * 	}
		 * 
		 */
		
		Child c = new Child();
		c.x = 10;
		c.y = 20;
		c.hello();
		System.out.println("c.x : " + c.x);
		System.out.println("c.y : " + c.y);
		
	}
	
	@Override
	// �θ𲨴� ������ ������ �� �Ը��� �°� ����ϰ� ����
	void hello() {
		System.out.println("Child()�� hello() �޼ҵ��Դϴ�.");
	}
}

class Parent{
	int x;
	int y;
	
	void hello() {
		System.out.println("Parent�� hello()�޼ҵ� �Դϴ�.");
	}
}
