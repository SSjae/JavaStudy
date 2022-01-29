package day10;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
		// 인스턴스클래스는 외부 클래스의 멤버 ( 인스턴스변수, 클래스변수 ) 접근이 가능하다.
	}
	
	static class StaticInner {
		// static클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	class Parent{}
	Parent p = null;
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner extends Parent {
			int liv = outerIv; // final int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
			/*
			 * 로컬클래스(내부클래스)에서는 상수만 사용이 가능하다.
			 * 지역변수는 닫는 중괄호를 만나면 메모리에서 해제된다.
			 * 그러나, 내부클래스의 객체(인스턴스)는 메소드가 끝나도 생존이 가능하다.
			 */
		}
		LocalInner li = new LocalInner();
		p = li;
	}
}