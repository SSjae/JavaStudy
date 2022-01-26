package day09;

public class InterfaceOfTest {
	public static void main(String[] args) {
		Fightable f = new Fighter();
		Fighter f1 = new Fighter();
	
		if (f1 instanceof Fighter) { // true
			System.out.println("f1은 Fighter클래스의 인스턴스입니다.");
		}
		if (f1 instanceof Unit) { // true
			System.out.println("f1은 Unit클래스의 자손입니다.");
		}
		if (f1 instanceof Fightable) { // true
			System.out.println("f1은 Fightable인터페이스를 구현했습니다.");
		}
		if (f1 instanceof Movable) { // true
			System.out.println("f1은 Movable인터페이스를 구현했습니다.");
		}
		if (f1 instanceof Attackable) { // true
			System.out.println("f1은 Attackable인터페이스를 구현했습니다.");
		}
		if (f1 instanceof Object) { // true
			System.out.println("f1은 Object클래스의 자손입니다.");
		}
	}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

// interface이기 떄문에 선언부에 따로 메소드를 정의할 필요가 없다.
interface Fightable extends Movable, Attackable {} // 인터페이스끼리 다중상속 가능.

class Fighter extends Unit implements Fightable {	// 인터페이스 구현

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Unit u) {}
	
}


