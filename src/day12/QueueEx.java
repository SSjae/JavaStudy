package day12;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // ť�� �ִ� 5�������� ����ǵ��� �Ѵ�.
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println(">> ");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) {
					continue;
				}
				if(input.equalsIgnoreCase("q")) { // q�� ���ؼ� �빮�� ������� ��
					System.exit(0);				  // ���α׷� ����
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println("history - �ֱٿ� �Է��� ��ɾ�� " + MAX_SIZE + "�� �����ݴϴ�.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);	// �Է¹��� ��ɾ ����
					
					// LinkedList�� ������ �����ش�.
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
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}
	
	// ť�� �����͸� �����ϴ� �޼ҵ�
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		// ť�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
