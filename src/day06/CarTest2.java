package day06;

class Car2 {
	String color;
	String gearType;
	int door;
	
	// this vs this()
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car2() {	// 다른 생성자 호출해서 사용
		this("white", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(Car2 c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		System.out.println("c1.color : " + c1.color);
		
		Car2 c2 = new Car2();
		System.out.println("c2.color : " + c2.color);
		
		Car2 c3 = new Car2("blue");
		System.out.println("c3.color : " + c3.color);
		
		Car2 c4 = new Car2("black", "auto", 2);
		System.out.println("c4.color : " + c4.color);
		
		Car2 c5 = new Car2(c4);
		System.out.println("c5.color : " + c5.color);
	}
}
