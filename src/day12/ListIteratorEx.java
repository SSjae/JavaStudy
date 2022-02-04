package day12;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		while(it.hasPrevious()) { // ¿ª¹æÇâ
			System.out.print(it.previous() + " ");
		}
	}
}
