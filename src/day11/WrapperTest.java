package day11;

public class WrapperTest {
	public static void main(String[] args) {
		// object 매개 변수는 아무거나 넘겨라 라는 의미이다.
		
		// 박싱
		Integer obj = new Integer(20); // 옛날 문법
		obj = (Integer) 20;	// 최신 문법
		Double obj2 = (Double) 10.24;
		
		// 언박싱
		int data = obj.intValue();
		double data2 = obj2.doubleValue();
		System.out.println(data);
		System.out.println(data2);
		System.out.println();
		
		// toString이 Integer에서 재정의 되기 떄문에 obj를 하면 주소가 아닌 진짜 값이 나온다.
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println();
		
		// 오토 박싱
		obj = 100;
		// 오토 언박싱
		data = obj;
	}
}