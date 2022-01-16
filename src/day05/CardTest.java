package day05;

class Card {
	String kind;	// 카드의 종류( spade, heart, diamond, clover )
	int num;		// 카드 번호
	
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
		
		c1.kind = "Diamond";
		c1.num = 5;
		
		c2.kind = "Clover";
		c2.num = 2;
		
		System.out.println("c1 : " + c1.kind + " " + c1.num);
		System.out.println("c2 : " + c2.kind + " " + c2.num);
		
		c1.width = 200;
		c2.height = 300;
		
		System.out.println(c2.width); // 200
		System.out.println(c2.height); // 300
		
		System.out.println(Card.width); // 200
		System.out.println(Card.height); // 300
	}
}
