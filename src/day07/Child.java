package day07;

public class Child extends Parent {
	public static void main(String[] args) {
		
		/*
		 * 	child() {
		 * 		super(){} // 부모가 아무 생성자을 안 가지고 있을 때만 자동적으로 추가
		 * 	}
		 * 
		 */
		
		Child c = new Child();
		c.x = 10;
		c.y = 20;
		c.hello();
		System.out.println("c.x : " + c.x);
		System.out.println("c.y : " + c.y);
		
	}
	
	@Override
	// 부모꺼는 가져다 쓰지만 내 입맛에 맞게 사용하게 만듬
	void hello() {
		System.out.println("Child()의 hello() 메소드입니다.");
	}
}

class Parent{
	int x;
	int y;
	
	void hello() {
		System.out.println("Parent의 hello()메소드 입니다.");
	}
}
