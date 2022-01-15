package day04;

public class ArrayEx5 {

	public static void main(String[] args) {
		// ÃÑÇÕ°ú Æò±Õ ±¸ÇÏ±â
		int sum = 0;
		double average = 0.0;
		
		int[] score = {100, 88, 97, 65, 42};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (double) score.length; // 78.4
		
		System.out.println("ÃÑÇÕ : " + sum);
		System.out.println("Æò±Õ : " + average);
	}
}
