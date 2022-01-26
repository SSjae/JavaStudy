package day09;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct());	// Product p = new TvProduct();
		System.out.println("���� ���� �� : " + b.money);
		System.out.println("���� ���ʽ� ���� : " + b.bonusPoint);
		
		b.buy(new ComputerProduct()); // Product p = new ComputerProduct();
		System.out.println("���� ���� �� : " + b.money);
		System.out.println("���� ���ʽ� ���� : " + b.bonusPoint);
		
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

// ��� �޴� Ŭ������ �����ڰ� �־�� �Ѵ�.
// �� �����ڿ��� ������ �θ��� �����ڰ� ȣ�� �Ǿ�� �Ѵ�.
// �ƹ��͵� ���ٸ� �⺻�����ڰ� �ڵ����� ����������� �θ𿡼� �⺻�����ڰ� ���ٸ� �����ڿ� �°� super()�� ȣ������� �Ѵ�.
class TvProduct extends Product {
	public TvProduct() {
		super(100);
	}
	
	// tv�� tv.toString�� ����.
	@Override
	public String toString() {
		return "TvProduct";
	}
}

class ComputerProduct extends Product {
	public ComputerProduct() {
		super(200);
	}
	
	// tv�� tv.toString�� ����.
	@Override
	public String toString() {
		return "ComputerProduct";
	}
}

class Buyer {			// ��, ������ ��� ����
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ� �ݾ�
	Product[] item = new Product[10];
	int i = 0;
	
//	void buy(TvProduct tv) {
//		if (money < tv.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		
//		money -= tv.price;
//		bonusPoint += tv.bounsPoint;
//		System.out.println(tv + "��/�� �����Ͽ����ϴ�.");
//	}
//	
//	void buy(ComputerProduct pc) {
//		if (money < pc.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		
//		money -= pc.price;
//		bonusPoint += pc.bounsPoint;
//		System.out.println(pc + "��/�� �����Ͽ����ϴ�.");
//	}
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bounsPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����Ͽ����ϴ�.");
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
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ� : " + sum);
		System.out.println("�����Ͻ� ��ǰ ��� : " + itemList);
	}
}