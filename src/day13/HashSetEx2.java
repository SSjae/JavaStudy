package day13;

import java.util.HashSet;

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));	// ���� �����͸� ������ ������ �ּҰ� �ٸ��� ������ �ٸ� ������ ���
		set.add(new Person("David", 10));	// �츮�� equals�� hashcode�� ������ �� ���� ������ �������
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
