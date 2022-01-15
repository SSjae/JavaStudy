package day04;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		int sum = 0;
		for(int i = 0; i < score.length; i++) { // score.length == 4
			for(int j = 0; j < score[i].length; j++) {
					sum += score[i][j];
			}
		}
		/*
		 * i == 0
		 * j >> 0 ~ 1
		 * score[0][0] ~ score[0][2]
		 * 
		 * i == 1
		 * score[1][0] ~ score[1][2]
		 */
		
		System.out.println("sum : " + sum);
	}
}
