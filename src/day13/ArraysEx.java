package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
		// copyOf(), copyOfRange() : 복사
		int[] arr = {0, 1, 2, 3, 4};
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 처음부터
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7); // 나머지는 0으로 채워짐
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 마지막 인덱스 전까지
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		// toString() : 출력
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		// equals(), deepEquals() : 비교
		System.out.println("\n" + Arrays.equals(arr, arr2)); // Arrays의 equals는 주소 값이 아닌 값을 비교
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // 일차원 배열을 비교하기 때문에 false
		System.out.println(Arrays.toString(str2D));	// 일차원 배열을 출력하는 것이기 때문에 다르게 나옴
		System.out.println(Arrays.deepToString(str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
				
		// fill(), setAll() : 채우기
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("\narr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6 + 1)); // 함수형 인터페이스 매개변수
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		// sort(), binarySearch() : 정렬, 정렬 후 찾기
		int[] numArr = {0, 7, 5, 1, 2};
		System.out.println("\nnumArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1)); // 이진탐색으로 찾기 때문에 정렬 후 해야함
		Arrays.sort(numArr);
		System.out.println("====== After sorting ======");
		System.out.println("numArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1));
		
		// asList() : list로 변환
		List list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("\nlist : " + list);
//		list.add(7); 길이를 변경 할려면 new로 한 다음 해야함
		list = new ArrayList(list);
		list.add(7);
		System.out.println("list : " + list);
	}
}
