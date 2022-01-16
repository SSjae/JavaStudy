package day05;

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 주소 : " + t1);
		System.out.println("t2의 주소 : " + t2);
		
		t2 = t1; // 참조변수가 가리키는 것을 바꿔줌, 그래서 t1, t2가 같은 곳을 가리키게 됨
		t1.channel = 7;
		System.out.println("t1의 channel : " + t1.channel); // 7
		System.out.println("t2의 channel : " + t2.channel); // 7
		System.out.println("t1의 주소 : " + t1);
		System.out.println("t2의 주소 : " + t2);
	}
}
