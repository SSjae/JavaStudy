package day15;

public class ThreadEx3 {
	public static void main(String[] args) {
		// 싱글쓰레드 소요시간 확인
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간 : " + ( System.currentTimeMillis() - startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간 : " + ( System.currentTimeMillis() - startTime));
	}
}
