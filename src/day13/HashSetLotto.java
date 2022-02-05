package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			set.add((int)(Math.random() * 45 + 1));
		}
		
		List list = new ArrayList(set);
		Collections.sort(list);
		// Collection�� �����ϱ� ���� CollectionsŬ���� ���
		System.out.println("�ζǹ�ȣ : " + list);
	}
}
