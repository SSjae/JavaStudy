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
		// headSet(n) : n ���� ���� �� ��ȯ
		System.out.println("50���� ���� �� : " + set.headSet(50));
		// tailSet(n) : n �̻��� �� ��ȯ
		System.out.println("50�̻��� �� : " + set.tailSet(50));
	}
}
