package day08;

public class AccessEx2 extends Access{
	void method() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		// System.out.println(defaultVar);
		// default는 패키지 달라지면 못씀
		// System.out.println(privateVar);
		// private은 같은 클래스에서만 접근 가능.
	}
}

class AccessEx3 {
	Access ac = new Access();
	int num = ac.publicVar;
	// 아예 상속도 아니고 다른 곳은 public만 됨
}
