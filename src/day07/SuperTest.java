package day07;

public class SuperTest {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		c.method2();
	}
}

class Parent2 {
	int x = 10;
	int y = 20;
}

class Child2 extends Parent2 {
	int y = 30;
	void method() {
		System.out.println("x = " + x);			// 10
		System.out.println("x = " + this.x);	// 10
		System.out.println("x = " + super.x);	// 10 ������ x
		System.out.println();
	}
	void method2() {
		System.out.println("y = " + y);			// 30 (������ �׻� ����� ������ ã��)
		System.out.println("y = " + this.y);	// 30
		System.out.println("y = " + super.y);	// 20 ������ y
	}
}
