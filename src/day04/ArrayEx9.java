package day04;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// ���Ľ�Ű��
		int[] numArr = new int[5];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 100 ) + 1;
		}
		System.out.println("[���� ��]");
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length; i++) {
			boolean changed = false;	// �ڸ��ٲ��� �߻��ߴ��� üũ�ϱ� ���� ����
			for(int j = 0; j < numArr.length - 1; j++) {
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true; // �ڸ��ٲ��� �߻������� changed�� true�� ����
				}
			}
			if(!changed) { // �ڸ��ٲ��� ������ �ݺ����� �����.
				break;
			}
		}
		System.out.println("[���� ��]");
		System.out.println(Arrays.toString(numArr));
	}
}
