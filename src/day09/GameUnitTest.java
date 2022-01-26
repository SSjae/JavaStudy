package day09;

public class GameUnitTest {
	public static void main(String[] args) {
		GameUnit[] group = new GameUnit[4];
		group[0] = new Marine();
		group[1] = new Marine();
		group[2] = new Marine();
		group[3] = new Marine();
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(1, 1);
		}
		
		// ��ó�� GameUnit�迭�� ���� Marine 20�� ����
		GameUnit[] marineGroup = new GameUnit[20];
		for(int i = 0; i < group.length; i++) {
			marineGroup[i] = new Marine();
			// �ڼ��� �޼��� ����ϰ� ���� ��
			Marine m2 = (Marine) marineGroup[i];
			m2.stimPack();
		}
		
		/*
		 *  �� �ڵ�� ���������� GameUnitŬ���� Ÿ���� �������� �迭�� ���ؼ�
		 *  ���� �ٸ� ������ �ν��Ͻ��� �ϳ��� �������� �ٷ� �� �ִٴ� ���� �����ֱ� ���� ���̴�.
		 *  ���������� ������� ����Ŭ������ ���������� �ڼ�Ŭ������ �ν��Ͻ��� �����ϴ� ���� �����ϱ� ������
		 *  ��ó�� ����Ŭ����Ÿ���� �迭�� �ڼ�Ŭ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� ���̴�.
		 *  ���⼭ ȣ��Ǵ� move(1,1)�� �ڼ�Ŭ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ���̴�.
		 */
		
		Object[] groups = new Object[4];
		groups[0] = new Marine();
		groups[1] = new Tank();
		groups[2] = new Marine();
		groups[3] = new DropShip();
		
		// Object���� move�� ���� ������ ����
//		for(int i = 0; i < groups.length; i++) {
//			groups[i].move(1, 1);
//		}
	}
}
