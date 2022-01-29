package day10;

public class InnerEx1 {

	static int cv1 = 100;
	
	class InstanceInner {	// �ν��Ͻ� Ŭ����
		int iv = 100;
//		static int cv = 100; �ν��Ͻ� Ŭ���� ���ο� static ������ ������ �� ����.
		final static int CONST = 100; // final static�� ����̹Ƿ� ���
	}
	
	static class StaticInner {	// static Ŭ����
		int iv = 200;
		static int cv = 200; // staticŬ������ static����� ������ �� �ִ�.
	}
	
	void method() {
		class LocalInner { // ���� Ŭ������ static�� ���� �� ����.
			int iv = 300;
//			static int cv1 = 300;
			final static int COST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(InnerEx1.InstanceInner.CONST);
		System.out.println();
		System.out.println(StaticInner.cv);
		System.out.println(InnerEx1.StaticInner.cv);
	}
}
