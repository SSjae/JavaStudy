package day11;

import java.util.Scanner;

public class ObjTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println(msg1 == msg2);
		// String도 클래스이기 때문에 msg1, msg2는 참조변수이다. 그래서 값이 아니라 주소 번지를 가리키고 주소 값을 비교한다.
		// msg1, msg2는 같은 상수 Hello이기에 같은 번지를 가리킨다. 그래서 true가 된다.
		
		String msg3 = "Hello";
//		String msg4 = sc.next();
		String msg5 = new String("Hello");
//		System.out.println(msg3 == msg4);
//		System.out.println(msg3.equals(msg4));
		// msg3도 Hello이기 때문에 같은 번지를 가리키지만 msg4는 오는 값이 다양하기 때문에
		// 다른 필드에서 만들어져서 다른 주소를 가리키기 떄문에 false가 된다.
		// 그래서 값을 비교하기 때문에 equals를 사용한다.
		
		// equals는 원래 Object클래스의 메소드이여서 살펴보면 ==이랑 다를게 없다.
		// 하지만 String은 이것을 재정의해주기 때문에 값만 비교가 가능하다.
		// 이 말은 즉, String은 Object의 자식이다.
//		--------------------------------------------------------------------------------------------------------
		// 동위객체 : 갖고 있는 값만 같은 객체..
		Test obj1 = new Test(10, "Hello");
		Test obj2 = new Test(10, "Hello");
		
		// toString()
		System.out.println(obj1);
		// println 메소드에서 toString을 해주기 때문에 똑같다.
		// 기본값은 그 객체의 주소값이다.
		System.out.println(obj1.toString());
		
		// equals()
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1.equals(obj2)); // true : 재정의한 메소드로 하기 떄문에 true
		// 기본값으로는 == 이기 때문에 다른걸로 나온다.
		// 객체들끼리 같게 취급할려면 우리가 재정의를 해줘야 한다.
		
		// hashCode() : 주소 값을 특정한 연산을 통해 정수로 변환한 것
		// 주소는 다르기 때문에 hashCode()도 당연히 다름, 그래서 재정의 필요
		// 해쉬코드까지 같게 해줘야지 같은 객체라고 자바가 인식함
		System.out.println(obj1.hashCode() == obj2.hashCode());
	}
}

class Test {
	int intData;
	String strData;
	
	public Test(int intData, String strData) {
		this.intData = intData;
		this.strData = strData;
	}
	
	@Override
	public String toString() {
		return "정수 : " + intData + " /  문자열 : " + strData;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj는 자식의 멤버들을 사용하지 못하기 때문에 사용할 수 있도록 해줘야 한다.(downCasting으로 변환)
		// 1. 타입비교
		if(obj instanceof Test) {
			// 2.다운캐스팅
			Test target = (Test) obj;
			// 3.조건비교
			if (this.intData == target.intData && this.strData.equals(target.strData)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return intData + strData.length();
	}
}
