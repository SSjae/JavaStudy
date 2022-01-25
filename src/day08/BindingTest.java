package day08;

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		// 메소드 자체는 인스턴스의 오버라이딩 된거를 가져가지만
		// 변수는 참조변수꺼를 가져간다.
		Child c = new Child();
		
		System.out.println("p.x = " + p.x); // 100 
		p.method();	// Child
		System.out.println("c.x = " + c.x);	// 200
		c.method();	// Child
		c.method1();
	}
}