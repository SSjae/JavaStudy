package day08;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		// instanceof를 이용한 연산결과로 true를 얻었다는 것은
		// 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
			Car car = (Car) fe;
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instance");
			Object obj = (Object) fe;
		}
	}
}
