package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		// Queue �������̽��� ����ü�� LinkedList�� ����Ѵ�.
		
		st.push("0");
		st.push("1");
		st.push("2"); // Stack�� �� ����
		
		q.offer("0");
		q.offer("1");
		q.offer("2"); // Queue�� �� ����
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
			// ���� �� ��ȯ
			// Stack�� �������� ����� �ָ� ���� ����
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			// ���� �� ��ȯ
			// Queue�� ó���� ������ �ָ� ���� ����
		}
	}
}
