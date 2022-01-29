package day10;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	// �ν��Ͻ���� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	
	// static��� ������ ���� ���� ������ �����ϴ�.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();
//		static����� �ν��Ͻ������ ���� ������ �� ����.
		
		StaticInner obj = new StaticInner();
		
		// ���� �����Ϸ��� �Ʒ��� ���� ��ü�� �����ؾ� �Ѵ�.
		// �ν��Ͻ� Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ������ �� �ִ�.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// �ν��Ͻ��޼ҵ忡���� �ν��Ͻ������ static����� ��� ������ �����ϴ�.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner iv = new LocalInner();
	}
}
