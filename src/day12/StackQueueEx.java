package day12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		// Queue 인터페이스의 구현체인 LinkedList를 사용한다.
		
		st.push("0");
		st.push("1");
		st.push("2"); // Stack에 값 저장
		
		q.offer("0");
		q.offer("1");
		q.offer("2"); // Queue에 값 저장
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
			// 삭제 후 반환
			// Stack은 마지막에 저장된 애를 먼저 꺼냄
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
			// 삭제 후 반환
			// Queue는 처음에 저장한 애를 먼저 꺼냄
		}
	}
}
