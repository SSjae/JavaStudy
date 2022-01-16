package day05;

public class TvTest1 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		// t1과 t2는 독립적인 인스턴스(객체)이다.
		
		System.out.println("t1의 channel : " + t1.channel); // 0
		System.out.println("t2의 channel : " + t2.channel); // 0
		
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1의 channel : " + t1.channel); // 7
		System.out.println("t2의 channel : " + t2.channel); // 0
	}
}
