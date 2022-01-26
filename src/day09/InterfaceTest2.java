package day09;

public class InterfaceTest2 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.methodA();
	}
}

interface I1 {
	void methodB();
}

class B1 implements I1 {
	@Override
	public void methodB() {
		System.out.println("methodB() in B class");
	}

	@Override
	public String toString() {
		return "Class B1";
	}
}

class C1 implements I1 {
	@Override
	public void methodB() {
		System.out.println("methodB() in C class");
	}

	@Override
	public String toString() {
		return "Class C1";
	}
}

class InstanceManager {
	public static I1 getInstance() {
		return new B1();
	}
}

class A1 {
	void methodA() {
		I1 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
