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
//		Fruit2Box2<Fruit2> Fruit2Box2 = new Fruit2Box2<Apple2>(); Error - ������ Ÿ�� ���ƾ� ��
//		Fruit2Box2<Toy2> Toy2Box2 = new Fruit2Box2<Toy2>(); // ���׸� �ش� �ȵ�
	
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

// <>�� Ÿ���� ��Ÿ���� ��, �ڿ� �ִ� extends�� ��¥�� ���
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