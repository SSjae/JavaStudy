package day10;

public class InnerEx4 {
	public static void main(String[] args) {
		// 인스턴스클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스를 먼저 생성해야한다.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv : " + ii.iv);
		
		// static 내부클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
		System.out.println("si.cv : " + si.cv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		ii.method();
	}
}

class Outer {
	
	int value = 10;
	
	class InstanceInner {
		int iv = 100;
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("value : " + value); // 30
			System.out.println("this.value : " + this.value); // 20 this : 가장 가까운 클래스 변수 사용
			System.out.println("Outer.this.value : " + Outer.this.value); // 10
		}
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}