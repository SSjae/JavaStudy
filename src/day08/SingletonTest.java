package day08;

class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if( s == null ) {
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton();
		// 하나의 객체를 만들어 그 하나로 다 쓴다( private 생성자 )
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println("s : " + s);
		System.out.println("s1 : " + s1);
	}
}
