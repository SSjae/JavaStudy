package day08;

public class Car { // 4��
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brr~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car { // 5��
	void water() {
		System.out.println("water");
	}
}