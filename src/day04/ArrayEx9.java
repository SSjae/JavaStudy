package day04;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 정렬시키기
		int[] numArr = new int[5];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 100 ) + 1;
		}
		System.out.println("[정렬 전]");
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지 체크하기 위한 변수
			for(int j = 0; j < numArr.length - 1; j++) {
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로 변경
				}
			}
			if(!changed) { // 자리바꿈이 없으면 반복문을 벗어난다.
				break;
			}
		}
		System.out.println("[정렬 후]");
		System.out.println(Arrays.toString(numArr));
	}
}
