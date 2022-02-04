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
		
		// ArrayList에만 국한되는 방법
		// 표준화로 하는 것이 더 낫다.
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
		// boolean it.hasNext() : 다음에 값이 있는 지 확인
		// Object it.next() : 다음 값을 반환
		Iterator it = list.iterator(); // 맨 처음에 커서가 생김
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		// iterator는 일회성이다.
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
