package day08;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		
		car = fe;	// car = (Car)fe; 에서 형변환이 생략된것이다.
//		car.water(); Car타입의 참조변수는 water()를 호출 할 수 없다.
		
		fe2 = (FireEngine) car;	// 캐스팅 불가능
		fe2.water();	// FireEngine -> Car 이기 때문에 오류
						// 인스턴스 객체가 Car이기 때문에
						// 5 -> 4
	}
}
