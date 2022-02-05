package day13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		// 1. entry�� ��°�� set���� ����
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			// Map.Entry : Map�� �ִ� �������̽�
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		System.out.println();
		
		// 2. key���� set���� ����
		set = map.keySet(); // key���� ������ �ߺ��� �ȵǴϱ� Set����
		System.out.println("������ ��� : " + set);
		System.out.println();
		
		// 3. value���� Collection���� ����
		Collection values = map.values(); // value���� �ߺ��� �ǵ� ��������Ƿ� Set���� �ϸ� �ȵ�
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (Integer)it.next();
			total += i;
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (double) total / set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
		// Collections Ŭ������ Collection�� �ٷ�� ���� ������ �޼ҵ���� �� �ִ� Ŭ����
	}
}