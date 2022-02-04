package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// ArrayList���� ���ѵǴ� ���
		// ǥ��ȭ�� �ϴ� ���� �� ����.
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
		// boolean it.hasNext() : ������ ���� �ִ� �� Ȯ��
		// Object it.next() : ���� ���� ��ȯ
		Iterator it = list.iterator(); // �� ó���� Ŀ���� ����
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		// iterator�� ��ȸ���̴�.
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		System.out.println();
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
