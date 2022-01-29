package day10;

public class AnonymousEx {
	public static void main(String[] args) {
		// 1��° Ȱ��
		AnonymousTest at = new A();
		AnonymousTest at1 = new AnonymousTest() {
			@Override
			public void method() {
				System.out.println("anonymous method");
			}
		};
		at1.method();
		
		// 2��° Ȱ��
		C c = new C();
//		c.parameter(new A());
		c.parameter(new AnonymousTest() {
			@Override
			public void method() {
				System.out.println("C Class");
				// �ѹ��� ����ϰ� ��!!
			}
		});
		
		// 3��° Ȱ��
		B b = new B();
		b.method();
		
		B b1 = new B() {
			@Override
			public void method() {
				System.out.println("Overrided method()");
			}
		};
		b1.method();
	}
}

interface AnonymousTest {
	void method();
}

class A implements AnonymousTest {

	@Override
	public void method() {
		System.out.println("A Class");
	}
}

class B {
	public void method() {
		System.out.println("B Class");
	}
}

class C {
	void parameter(AnonymousTest a) {
		a.method();
	}
}