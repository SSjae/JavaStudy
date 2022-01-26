package day09;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct());	// Product p = new TvProduct();
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
		
		b.buy(new ComputerProduct()); // Product p = new ComputerProduct();
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("현재 보너스 점수 : " + b.bonusPoint);
		
		b.summary();
	}
}

class Product {
	int price;
	int bounsPoint;
	
	public Product(int price) {
		this.price = price;
		bounsPoint = (int)(price / 10.0);
	}
}

// 상속 받는 클래스는 생성자가 있어야 한다.
// 그 생성자에는 무조건 부모의 생성자가 호출 되어야 한다.
// 아무것도 없다면 기본생성자가 자동으로 만들어지지만 부모에서 기본생성자가 없다면 생성자에 맞게 super()를 호출해줘야 한다.
class TvProduct extends Product {
	public TvProduct() {
		super(100);
	}
	
	// tv나 tv.toString과 같다.
	@Override
	public String toString() {
		return "TvProduct";
	}
}

class ComputerProduct extends Product {
	public ComputerProduct() {
		super(200);
	}
	
	// tv나 tv.toString과 같다.
	@Override
	public String toString() {
		return "ComputerProduct";
	}
}

class Buyer {			// 고객, 물건을 사는 행위
	int money = 1000;	// 보유금액
	int bonusPoint = 0;	// 보너스 금액
	Product[] item = new Product[10];
	int i = 0;
	
//	void buy(TvProduct tv) {
//		if (money < tv.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		
//		money -= tv.price;
//		bonusPoint += tv.bounsPoint;
//		System.out.println(tv + "을/를 구매하였습니다.");
//	}
//	
//	void buy(ComputerProduct pc) {
//		if (money < pc.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		
//		money -= pc.price;
//		bonusPoint += pc.bounsPoint;
//		System.out.println(pc + "을/를 구매하였습니다.");
//	}
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bounsPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구매하였습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("구매하신 물품의 총 금액 : " + sum);
		System.out.println("구매하신 제품 목록 : " + itemList);
	}
}