package day04;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		// System.arraycopy()�� �̿��� ����
		char[] abc = {'a', 'b', 'c', 'd'}; // ���� : 4
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // ���� : 10
		char[] result = new char[abc.length + num.length]; // ���� : 14
		System.out.println("result : " + Arrays.toString(result));
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println("[abc�迭�� result�� ���� ��]");
		System.out.println("result : " + Arrays.toString(result));
		
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println("[num�迭�� result�� ���� ��]");
		System.out.println("result : " + Arrays.toString(result));
	}
}
