package day05;

public class TvTest1 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		// t1�� t2�� �������� �ν��Ͻ�(��ü)�̴�.
		
		System.out.println("t1�� channel : " + t1.channel); // 0
		System.out.println("t2�� channel : " + t2.channel); // 0
		
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1�� channel : " + t1.channel); // 7
		System.out.println("t2�� channel : " + t2.channel); // 0
	}
}
