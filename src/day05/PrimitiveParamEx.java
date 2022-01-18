package day05;

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("=====기본형 매개변수=====");
		System.out.println("main() : " + d.x); // 10
		change1(d.x);	// 메소드 내에서만 바뀜
		System.out.println("main() : " + d.x); // 10, 실제 값은 바뀌지 않음
		

		System.out.println("\n=====참조형 매개변수=====");
		System.out.println("main() : " + d.x); // 10
		change2(d);		// 주소( 객체 자체 )가 가기 때문에 실제 값이 바뀜
		System.out.println("main() : " + d.x); // 1000, 실제 값은 바뀜
	}
	
	static void change1(int x) { // int x = 10; 기본형 매개변수
		x = 1000;
		System.out.println("change1() : " + x);
	}
	
	static void change2(Data d) { // Data d = new Data(); 참조형 매개변수
		d.x = 1000;
		System.out.println("change2() : " + d.x);
	}
}
