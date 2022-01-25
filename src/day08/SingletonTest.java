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
		// �ϳ��� ��ü�� ����� �� �ϳ��� �� ����( private ������ )
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println("s : " + s);
		System.out.println("s1 : " + s1);
	}
}
