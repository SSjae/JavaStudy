package day04;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		// �迭 ��� ���� ( shffle )
		int[] numArr = new int[10];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.println("[���� ��]");
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10); // n�� ���� : 0 ~ 9
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		/*
		 * n == 3
		 * tmp == 0
		 * numArr[0] == 3 ( numArr[3] == 3 )
		 * numArr[3] == 0
		 */
		System.out.println("[���� ��]");
		System.out.println(Arrays.toString(numArr));
	}
}
