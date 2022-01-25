package day08;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // 캐스팅 불가능
		// FireEngine -> Car 이기 때문에 오류
		// 인스턴스 객체가 Car이기 때문에
		// 5 -> 4
	}
}