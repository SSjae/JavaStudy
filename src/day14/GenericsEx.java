package day14;

import java.util.ArrayList;

public class GenericsEx {
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
//		list.add("abc");
		
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.println("num : " + num);
		}
		
		// 둘이 똑같은 의미 <Object> 생략
		ArrayList list1 = new ArrayList();
		ArrayList<Object> list2 = new ArrayList<Object>();
	}
}
