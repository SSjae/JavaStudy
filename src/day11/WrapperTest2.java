package day11;

public class WrapperTest2 {
	public static void main(String[] args) {
		Integer data1 = 100; // 오토박싱
		int data2 = 200;
		
		int result = data1 + data2; // 이 때 data1은 오토 언박싱이 되어서 연산이 된다.
		System.out.println(result);
		
		// 메소드가 하나씩 밖에 없을 때
		Test.f(data1); // int data로 객체가 날아가서 들어갈 때 오토 언박싱이 자연스레 된다.
		Test.f(data2); // Integer obj로 기본형이 날아가서 들어갈 때 오토 박싱이 자연스레 된다.
		
		
		// 오버로딩으로 메소드가 다양하게 있을 때(혼자 있으면 그냥 넘겨도 알아서 오토로 됨)
		Test.f(data1.intValue()); // 그냥 넘기면 컴퓨터가 2를 선택해서 함
								  // 하지만 우리는 1를 쓰고 싶다면 우리가 직접 언박싱 해줘야 한다.
		Test.f((Integer) data2); // 그냥 넘기면 컴퓨터가 1를 선택해서 함
								 // 하지만 우리는 2를 쓰고 싶다면 우리가 직접 박싱 해줘야 한다.
		
		// 캐스팅, 박싱, 언박싱 중에서는 컴터는 캐스팅을 더 편해한다.
		Object obj = data1; // 그냥 넘기면 컴퓨터가 2를 선택해서 함
		Test.f(obj); 		// 하지만 우리는 3를 쓰고 싶다면 우리가 직접 캐스팅 해줘야 한다.
		
		Test.f(data1); // 1,3번만 있다면 data1은 객체이기 때문에 3번으로 가게 된다.
		
		// 기본 자료형인 data2를 박싱해주게 되면 Integer 객체로 변환된다.
		// 업캐스팅을 하지 않아도 객체를 넘기라는 가장 3번이 호출되게 된다.
		Test.f((Integer) data2); // 1,3번만 있을 때 3번으로 가고 싶으면
					   			 // data2는 기본형이기 때문에 박싱을 해서 객체로 만들어주면 된다.
	
	
		// 10은 오토박싱이 되고 업캐스팅이 된다.
		// 'A'도 오토박싱이 되고 업캐스팅
		// "String"은 애초에 객체이기 떄문에 업캐스팅만 됨
		Object[] arr = {10, 'A', "String", 10.204, true};
	}
}

class Test {
	// 1
	static void f(int data) {
		System.out.println("기본 자료형으로 호출한 f()");
	}
	
	// 2
	static void f(Integer obj) {
		System.out.println("클래스 타입으로 호출한 f()");
	}
	
	// 3
	// Object 타입의 매개변수는 상징적 의미
	// 모든 것을 넘겨라!! 혹은 객체를 넘겨라!!
	static void f(Object obj) {
		System.out.println("Object 타입으로 호출한 f()");
	}
}