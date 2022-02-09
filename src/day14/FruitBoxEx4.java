package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
	String name;
	int weight;
	
	public Fruit4(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() { return name + "(" + weight + ")"; }
}

class Apple4 extends Fruit4 {
	public Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit4 {
	public Grape4(String name, int weight) {
		super(name, weight);
	}
}

class Apple4Comp implements Comparator<Apple4> {
	@Override
	public int compare(Apple4 o1, Apple4 o2) {
		return o2.weight - o1.weight;
	}	
}

class Grape4Comp implements Comparator<Grape4> {
	@Override
	public int compare(Grape4 o1, Grape4 o2) {
		return o1.weight - o2.weight;
	}	
}

class Fruit4Comp implements Comparator<Fruit4> {
	@Override
	public int compare(Fruit4 o1, Fruit4 o2) {
		if(o1 instanceof Apple4 && o2 instanceof Apple4) {
			return o2.weight - o1.weight;
		}else if (o1 instanceof Grape4 && o2 instanceof Grape4) {
			return o1.weight - o2.weight;
		}
		return -1;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		Fruit4Box4<Apple4> Apple4Box4 = new Fruit4Box4<>();
		Fruit4Box4<Grape4> Grape4Box4 = new Fruit4Box4<>();
	
		Apple4Box4.add(new Apple4("GreenApple4", 300));
		Apple4Box4.add(new Apple4("GreenApple4", 100));
		Apple4Box4.add(new Apple4("GreenApple4", 200));
		
		Grape4Box4.add(new Grape4("GreenGrape4", 200));
		Grape4Box4.add(new Grape4("GreenGrape4", 400));
		Grape4Box4.add(new Grape4("GreenGrape4", 100));
		
//		System.out.println("== Apple4 정렬 전 ==");
//		System.out.println("Apple4Box4 : " + Apple4Box4);
//		Collections.sort(Apple4Box4.getList(), new Apple4Comp());
//		System.out.println("== Apple4 정렬 후 ==");
//		System.out.println("Apple4Box4 : " + Apple4Box4);
//		System.out.println();
//		System.out.println("== Grape4 정렬 전 ==");
//		System.out.println("Grape4Box4 : " + Grape4Box4);
//		Collections.sort(Grape4Box4.getList(), new Grape4Comp());
//		System.out.println("== Grape4 정렬 후 ==");
//		System.out.println("Grape4Box4 : " + Grape4Box4);
		
		System.out.println("== Apple4, Grape4 정렬 전 == ");
		System.out.println("Apple4Box4 : " + Apple4Box4);
		System.out.println("Grape4Box4 : " + Grape4Box4);
		Collections.sort(Apple4Box4.getList(), new Fruit4Comp()); // 와일드카드 
		Collections.sort(Grape4Box4.getList(), new Fruit4Comp()); // 와일드카드
		System.out.println("== Apple4, Grape4 정렬 후 == ");
		System.out.println("Apple4Box4 : " + Apple4Box4);
		System.out.println("Grape4Box4 : " + Grape4Box4);
		
		// Apple4Comp, Grape4Comp : Apple4 내림차순, Grape4는 오름차순
		// Fruit4Comp : 둘 다 오름차순
		// Fruit4Comp클래스를 수정해서, Apple4일 경우 내림차순,
		// Grape4일 경우 오름차순으로 변경
	}
}

class Fruit4Box4<T extends Fruit4> extends Box4<T>{}

class Box4<T> {
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