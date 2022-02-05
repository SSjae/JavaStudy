package day13;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		System.out.println("���� �� : " + Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println("�⺻ ���� �� : " + Arrays.toString(strArr));
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� �������� �ʰ� ��
		System.out.println("��ҹ��� �������� ���� ���� �� : " + Arrays.toString(strArr));
		
		// ��������
		Arrays.sort(strArr, new Descending());
		System.out.println("�������� �� : " + Arrays.toString(strArr));
	}
}

// compare(a, b) : ���� ���� a,b�� ��
// a.compareTo(b) : a�� ���� ���� b�� ��
// a�� ������ ����, ������ 0, a�� ũ�� ���

class Descending implements Comparator{ // ���������� ������ �� �� ����ϴ� �������̽�
	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}
