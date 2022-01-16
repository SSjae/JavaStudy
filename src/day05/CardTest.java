package day05;

class Card {
	String kind;	// 카드의 종류 ( spade, heart, diamond, clover )
	int number;		// 카드 번호

	static int width = 100;		// 카드의 너비
	static int height = 250;	// 카드의 높이

}

public class CardTest {
	public static void main(String[] args) {
		// '클래스이름.클래스변수'
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c1.number = 7;
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 : " + c1.kind + " " + c1.number);
		System.out.println("c2 : " + c2.kind + " " + c2.number);
		
		c1.width = 200;
		c1.height = 300;
		
		System.out.println(c2.width); // 200
		System.out.println(c2.height); // 300
		
		System.out.println(Card.width); // 200
		System.out.println(Card.height); // 300
	}
}
