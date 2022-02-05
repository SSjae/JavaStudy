package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
		// copyOf(), copyOfRange() : ����
		int[] arr = {0, 1, 2, 3, 4};
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // ó������
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7); // �������� 0���� ä����
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // ������ �ε��� ������
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		// toString() : ���
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		// equals(), deepEquals() : ��
		System.out.println("\n" + Arrays.equals(arr, arr2)); // Arrays�� equals�� �ּ� ���� �ƴ� ���� ��
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // ������ �迭�� ���ϱ� ������ false
		System.out.println(Arrays.toString(str2D));	// ������ �迭�� ����ϴ� ���̱� ������ �ٸ��� ����
		System.out.println(Arrays.deepToString(str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
				
		// fill(), setAll() : ä���
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("\narr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6 + 1)); // �Լ��� �������̽� �Ű�����
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		// sort(), binarySearch() : ����, ���� �� ã��
		int[] numArr = {0, 7, 5, 1, 2};
		System.out.println("\nnumArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1)); // ����Ž������ ã�� ������ ���� �� �ؾ���
		Arrays.sort(numArr);
		System.out.println("====== After sorting ======");
		System.out.println("numArr : " + Arrays.toString(numArr));
		System.out.println("Index of 1 : " + Arrays.binarySearch(numArr, 1));
		
		// asList() : list�� ��ȯ
		List list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("\nlist : " + list);
//		list.add(7); ���̸� ���� �ҷ��� new�� �� ���� �ؾ���
		list = new ArrayList(list);
		list.add(7);
		System.out.println("list : " + list);
	}
}
