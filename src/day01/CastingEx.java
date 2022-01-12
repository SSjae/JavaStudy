package day01;

public class CastingEx {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int) d; // 강제 형변환
		System.out.println("score : " + score);
		System.out.println("d : " + d);
		
		double d1 = (double) 80;
		System.out.println("d1 : " + d1);
	}

}
