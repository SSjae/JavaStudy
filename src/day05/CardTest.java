package day05;

class Card {
	String kind;	// ī���� ���� ( spade, heart, diamond, clover )
	int number;		// ī�� ��ȣ

	static int width = 100;		// ī���� �ʺ�
	static int height = 250;	// ī���� ����

}

public class CardTest {
	public static void main(String[] args) {
		// 'Ŭ�����̸�.Ŭ��������'
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
