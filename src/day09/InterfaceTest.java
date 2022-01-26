package day09;

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());	// a.methodA(B b); ==> B b = new B();
		a.methodA(new C());	// InterfacePractice i = new C();
	}
}

class A {
	public void methodA(InterfacePractice i) {	// �������̽� �Ű������� ���
		i.methodB();
	}
}

class B implements InterfacePractice {	// �������̽� ����
	public void methodB() {
		System.out.println("methodB() in B Class");
	}
}

class C implements InterfacePractice {	// �������̽� ����
	public void methodB() {
		System.out.println("methodB() in C Class");
	}
}


interface InterfacePractice {	// �������̽�
	void methodB();
}













