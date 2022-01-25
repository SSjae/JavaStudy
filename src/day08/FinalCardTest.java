package day08;

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 200;
	
	// static�̱� ������ ���� Ŭ������ �ö󰡱� ������ final ���� ���ÿ� �ʱ�ȭ
	static final int CONST = 10;
	
	public Card() {
		this("HEART", 1);
	}
	
	Card(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.KIND);		// HEART
		System.out.println(c.NUMBER);	// 1
	}
}
