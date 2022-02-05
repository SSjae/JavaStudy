package day13;

import java.util.HashSet;

public class HashSetEx3 {
	public static void main(String[] args) {
		Person2 p1 = new Person2("David", 10);
		Person2 p2 = new Person2("David", 10);
		System.out.println(p1.equals(p2));
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(p1); // equals와 hashcode 둘다 같게 해줘야 중복이 안된다.
		set.add(p2);
		System.out.println("set : " + set);
	}
}

class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name +  " : " + age;
	}
	
	@Override
	public boolean equals(Object obj) {	// Object obj = new Person2("David", 10); p2
		if(obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return this.name.equals(tmp.name) && this.age == tmp.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
}
