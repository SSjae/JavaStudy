package day06;

class MyMath {	// �����ε�( �Ű������� ���� �Ҹ��� �޼ҵ尡 �޶��� ), ������ �޼ҵ��� �̸��� ����
	int add (int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add (int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;	// int + long -> long + long -> long
	}
	
	long add (long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add (long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add (int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i : a) {
			result += i;
		}
		return result;
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("mm.add(3,3) : " + mm.add(3,3)); // call by value
		System.out.println("mm.add(3,3L) : " + mm.add(3,3L)); 
		System.out.println("mm.add(3L,3) : " + mm.add(3L,3));
		System.out.println("mm.add(3L,3L) : " + mm.add(3L,3L));
		
		int[] arr = {100, 200, 300};
		System.out.println("mm.add(arr) : " + mm.add(arr)); // call by reference
	}
}


