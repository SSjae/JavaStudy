package day06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // 奄沙 持失切
	
	Car(String c, String g, int d) { // 持失切
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println("c1.color : " + c1.color);
		
		
		Car c2 = new Car("black", "auto", 2);
		System.out.println("c2.color : " + c2.color);
	}
}
