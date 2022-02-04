package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
	public static void main(String[] args) {
		ArrayList original = new ArrayList();
		ArrayList copy1 = new ArrayList();
		ArrayList copy2 = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			original.add(i + " ");
		}
		System.out.println("original : " + original);
		
		Iterator it = original.iterator();
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		System.out.println("copy1 : " + copy1);
		
		// Iterator�� ������ �ȵǹǷ� �ٽ� ���;� �Ѵ�.
		it = original.iterator();
		while(it.hasNext()) {
			copy2.add(it.next());
		}
		System.out.println("copy2 : " + copy2);
	}
}
