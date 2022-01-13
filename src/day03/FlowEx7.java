package day03;

public class FlowEx7 {

	public static void main(String[] args) {
		for ( int i = 0; i <= 5; i++ ) {
			System.out.println("i의 값 : " + i);
		}
		
		System.out.println();
		
		int j = 0;
		for ( j = 0; j <= 5; j++) {
			System.out.println("j의 값 : " + j);
		}
		System.out.println("최종 j의 값 : " + j); // 6
	}
}
