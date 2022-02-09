package day14;

import java.util.ArrayList;

class Fruit3 {
	@Override
	public String toString() { return "Fruit3"; }
}

class Apple3 extends Fruit3 {
	@Override
	public String toString() { return "Apple3"; }
}

class Grape3 extends Fruit3 {
	@Override
	public String toString() { return "Grape3"; }
}

class Juice {
	String name;
	
	public Juice(String name) {
		this.name = name + "Juice";
	}
	
	@Override
	public String toString() { return name; }
}

class Juicer {
//	// 1. 와일드카드를 이용한 메소드
////	static Juice makeJuice(Fruit3Box3<Fruit3> Box3) {
//	static Juice makeJuice(Fruit3Box3<? extends Fruit3> Box3) {
//		String tmp = "";
//		
//		// 1. 향상된 for문
////		for(Fruit3 f : Box3.getList()) {
////			tmp += f + " ";
////		}
//		
//		// 2. 일반 for문
//		for(int i = 0; i < Box3.getList().size(); i++) {
//			tmp += Box3.getList().get(i) + " ";
//		}
//		
//		return new Juice(tmp);
//	}
//}
	// 2. 제네릭메소드
	static <T extends Fruit3> Juice makeJuice(Fruit3Box3<T> Box3) {
		String tmp = "";
		
		for(Fruit3 f : Box3.getList()) {
			tmp += f + " ";
		}
		
		return new Juice(tmp);
	}
}

public class FruitBoxEx3 {
	public static void main(String[] args) {
		Fruit3Box3<Fruit3> Fruit3Box3 = new Fruit3Box3<>();
		Fruit3Box3<Apple3> Apple3Box3 = new Fruit3Box3<>();
		
		Fruit3Box3.add(new Apple3());
		Fruit3Box3.add(new Grape3());
		
		Apple3Box3.add(new Apple3());
		Apple3Box3.add(new Apple3());
		
		System.out.println(Juicer.makeJuice(Fruit3Box3));
		System.out.println(Juicer.makeJuice(Apple3Box3));
	}
}

class Fruit3Box3<T extends Fruit3> extends Box3<T>{}

class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() {
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
