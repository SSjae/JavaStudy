package day13;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));	// 같은 데이터를 가지고 있지만 주소가 다르기 때문에 다른 값으로 취급
		set.add(new Person("David", 10));	// 우리는 equals랑 hashcode를 재정의 해 같은 것으로 해줘야함
		System.out.println("set : " + set);
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name +  " : " + age;
	}
}
