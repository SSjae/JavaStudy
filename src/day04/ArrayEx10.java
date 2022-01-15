package day04;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		// 빈도수 구하기
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * numArr.length); // 값의 범위 : 0 ~ 9
		}
		System.out.println("배열의 요소 : " + Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		/*
		 * i == 0
		 * counter[numArr[0]]++; ==> counter[4]++;
		 * i == 1
		 * counter[numArr[1]]++; ==> counter[9]++;
		 * i == 9
		 * counter[numArr[9]]++; ==> counter[4]++;
		 */
		
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
