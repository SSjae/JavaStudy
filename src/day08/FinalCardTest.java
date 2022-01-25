package day08;

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 200;
	
	// static이기 때문에 먼저 클래스가 올라가기 때문에 final 선언 동시에 초기화
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
