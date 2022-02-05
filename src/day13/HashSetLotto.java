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
		// Collection을 정렬하기 위해 Collections클래스 사용
		System.out.println("로또번호 : " + list);
	}
}
