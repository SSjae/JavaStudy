package day09;

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());	// a.methodA(B b); ==> B b = new B();
		a.methodA(new C());	// InterfacePractice i = new C();
	}
}

class A {
	public void methodA(InterfacePractice i) {	// 인터페이스 매개변수로 사용
		i.methodB();
	}
}

class B implements InterfacePractice {	// 인터페이스 구현
	public void methodB() {
		System.out.println("methodB() in B Class");
	}
}

class C implements InterfacePractice {	// 인터페이스 구현
	public void methodB() {
		System.out.println("methodB() in C Class");
	}
}


interface InterfacePractice {	// 인터페이스
	void methodB();
}













