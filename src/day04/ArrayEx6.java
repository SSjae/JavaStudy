package day04;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 최댓값과 최솟값 찾기
		
		int[] score = {79,88,91,33,100,55,95};
		int max;
		int min;
		
		max = score[0]; // 최댓값이라고 가정
		min = score[0]; // 최솟값이라고 가정
		
		for(int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		/*
		 * i == 1
		 * max == 79
		 * score[1] == 88
		 * score[1] > max ==> 88 > 79 ==> max == 88, min == 79
		 * 
		 * i == 2
		 * max == 88
		 * score[2] == 91
		 * score[2] > max ==> 91 > 81 ==> max == 91, min == 79
		 * 
		 * i == 3
		 * max == 91
		 * score[3] == 33
		 * score[3] > max == > 33 > 91 false
		 * score[3] < min ==> 33 < 79 ==> min == 33, max == 91
		 */
		
		System.out.println("최댓값 : " + max); // 100
		System.out.println("최솟값 : " + min); // 33
	}
}
