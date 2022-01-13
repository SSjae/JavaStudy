package day03;

public class FlowEx9 {

	public static void main(String[] args) {
		// 이중 for문
		
		// 세로 구구단
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		//가로 구구단
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}
