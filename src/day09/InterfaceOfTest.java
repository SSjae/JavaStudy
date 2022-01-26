package day09;

public class InterfaceOfTest {
	public static void main(String[] args) {
		Fightable f = new Fighter();
		Fighter f1 = new Fighter();
	
		if (f1 instanceof Fighter) { // true
			System.out.println("f1�� FighterŬ������ �ν��Ͻ��Դϴ�.");
		}
		if (f1 instanceof Unit) { // true
			System.out.println("f1�� UnitŬ������ �ڼ��Դϴ�.");
		}
		if (f1 instanceof Fightable) { // true
			System.out.println("f1�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if (f1 instanceof Movable) { // true
			System.out.println("f1�� Movable�������̽��� �����߽��ϴ�.");
		}
		if (f1 instanceof Attackable) { // true
			System.out.println("f1�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if (f1 instanceof Object) { // true
			System.out.println("f1�� ObjectŬ������ �ڼ��Դϴ�.");
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

// interface�̱� ������ ����ο� ���� �޼ҵ带 ������ �ʿ䰡 ����.
interface Fightable extends Movable, Attackable {} // �������̽����� ���߻�� ����.

class Fighter extends Unit implements Fightable {	// �������̽� ����

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Unit u) {}
	
}


