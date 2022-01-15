package day04;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[2] = 80;
		score[3] = 90;
		
		System.out.println("score : " + Arrays.toString(score));
		System.out.println();
		
		int tmp = score[k+2] + score[4];
		System.out.println("tmp : " + tmp); // 90
		System.out.println();
		
		for( int i = 0; i < score.length; i++ ) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
		System.out.println();
		
		for( int ele : score ) {
			System.out.println("ele : " + ele);
		}
		
//		System.out.println(score[5]); // ¿¡·¯
	}
}
