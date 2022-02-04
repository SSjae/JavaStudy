package day12;

import java.util.Stack;

public class StackEx {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goUrl("1. ����Ʈ");
		goUrl("2. ����");
		goUrl("3. ���̹�");
		goUrl("4. ����");
		printStatus();
		
		goBack();
		System.out.println("= �ڷΰ��� ��ư ���� ��");
		printStatus();
		
		goBack();
		System.out.println("= �ڷΰ��� ��ư ���� ��");
		printStatus();
		
		goForward();
		System.out.println("= ������ ���� ��ư�� ���� ��");
		printStatus();
		
		goUrl("koreastudyroom.com");
		System.out.println("= ���ο� �ּҷ� �̵��� �� =");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� : " + back.peek() + " �Դϴ�.");
	}
	
	public static void goUrl(String url) {
		back.push(url);
		
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	// ������ ����
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	// �ڷ� ����
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
}
