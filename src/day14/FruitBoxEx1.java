package day14;

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
	@Override
	public String toString() { return "Apple"; }
}

class Grape extends Fruit {
	@Override
	public String toString() { return "Grape"; }
}

class Toy {
	@Override
	public String toString() { return "Toy"; }
}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<>();
//		Box<Grape> grape = new Box<Apple>(); 제네릭 타입 불일치
		
		Fruit f = new Fruit();
		fruitBox.add(f);
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // Fruit item = new Apple();
		
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // Apple item = new Toy();
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());
		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("toyBox : " + toyBox);
		System.out.println("fruitBox[0] : " + fruitBox.get(0));
		System.out.println("fruitBox size : " + fruitBox.size());
	}
}

class Box<T> { // 과일을 담을 박스클래스
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}