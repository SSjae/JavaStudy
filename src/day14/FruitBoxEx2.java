package day14;

import java.util.ArrayList;

interface Eatable{}

class Fruit2 implements Eatable {
	@Override
	public String toString() { return "Fruit2"; }
}

class Apple2 extends Fruit2 {
	@Override
	public String toString() { return "Apple2"; }
}

class Grape2 extends Fruit2 {
	@Override
	public String toString() { return "Grape2"; }
}

class Toy2 {
	@Override
	public String toString() { return "Toy2"; }
}
	
public class FruitBoxEx2 {
	public static void main(String[] args) {
		Fruit2Box2<Fruit2> Fruit2Box2 = new Fruit2Box2<>();
		Fruit2Box2<Apple2> Apple2Box2 = new Fruit2Box2<>();
		Fruit2Box2<Grape2> Grape2Box2 = new Fruit2Box2<>();
//		Fruit2Box2<Grape2> Grape2Box2 = new Fruit2Box2<Apple2>(); Error
//		Fruit2Box2<Fruit2> Fruit2Box2 = new Fruit2Box2<Apple2>(); Error - 무조건 타입 같아야 함
//		Fruit2Box2<Toy2> Toy2Box2 = new Fruit2Box2<Toy2>(); // 제네릭 해당 안됨
	
		Fruit2Box2.add(new Fruit2()); // Fruit2 item = new Fruit2():
		Fruit2Box2.add(new Apple2()); // Fruit2 item = new Apple2():
		Fruit2Box2.add(new Grape2()); // Fruit2 item = new Grape2():
		
		Apple2Box2.add(new Apple2()); // Apple2 item = new Apple2();
//		Apple2Box2.add(new Grape2()); Error -> Apple2 item = new Grape2();
		
		Grape2Box2.add(new Grape2()); // Grape2 item = new Grape2();
		
		System.out.println("Fruit2Box2 : " + Fruit2Box2);
		System.out.println("Apple2Box2 : " + Apple2Box2);
		System.out.println("Grape2Box2 : " + Grape2Box2);
	}
}

// <>는 타입을 나타내는 거, 뒤에 있는 extends는 진짜로 상속
class Fruit2Box2<T extends Fruit2 & Eatable> extends Box2<T>{}

class Box2<T> {
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