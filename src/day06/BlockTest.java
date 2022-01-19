package day06;

public class BlockTest {
	
	static int[] arr = new int[10];
	
	// 생성자
	BlockTest() {
		System.out.println("생성자입니다.");
	}
	
	// 인스턴스 초기화 블록
	{
		System.out.println("인스턴스 초기화 블록입니다.");
	}
	
	// static 초기화 블록( 클래스 초기화 블록 )
	static {
		System.out.println("클래스 초기화 블록입니다.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("첫 번쨰 인스턴스 생성입니다.");
		BlockTest bt = new BlockTest();
		
		System.out.println("두 번쨰 인스턴스 생성입니다.");
		BlockTest bt2 = new BlockTest();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
