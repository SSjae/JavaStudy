package day05;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main()�� ���۵Ǿ���.");
		firstMethod(); // CallStackTest.firstMethod(); �� �� ����
		//���� Ŭ���� ���� �޼ҵ� ȣ�� �� Ŭ���� �̸� ���� ����
		System.out.println("main()�� ������.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���.");
		secondMethod();
		System.out.println("firstMethod()�� ������.");
		
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���.");
		System.out.println("secondMethod()�� ������.");
		
	}
}
