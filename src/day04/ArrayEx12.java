package day04;

public class ArrayEx12 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,51,50}
		};
		int korTotal, engTotal, mathTotal;
		korTotal = engTotal = mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(" " + (i + 1));
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print("\t" + score[i][j]);
			}
			avg = sum / (float) score.length;
			System.out.println("\t" + sum + "\t" + avg);
		}
		// 국어 총합, 영어 총합, 수학 총합
		System.out.println("--\t" + korTotal + "\t" + engTotal +"\t" + mathTotal);
	}
}
