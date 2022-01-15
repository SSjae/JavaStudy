package day04;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		// for문을 이용한 복사
		int[] arr = new int[5];
		int[] tmp = new int[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("arr : " + Arrays.toString(arr));
	
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		System.out.println("tmp : " + Arrays.toString(tmp));
	}

}
