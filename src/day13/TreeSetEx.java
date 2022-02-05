package day13;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println("set : " + set);
		// headSet(n) : n 보다 작은 값 반환
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		// tailSet(n) : n 이상인 값 반환
		System.out.println("50이상인 값 : " + set.tailSet(50));
	}
}
