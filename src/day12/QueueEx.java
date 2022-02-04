package day12;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 큐에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">> ");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) {
					continue;
				}
				if(input.equalsIgnoreCase("q")) { // q에 대해서 대문자 상관없이 비교
					System.exit(0);				  // 프로그램 종료
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어들 " + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);	// 입력받은 명령어를 저장
					
					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
					
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}
	
	// 큐에 데이터를 저장하는 메소드
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		// 큐의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
