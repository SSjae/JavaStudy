package day08;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		
		car = fe;	// car = (Car)fe; ���� ����ȯ�� �����Ȱ��̴�.
//		car.water(); CarŸ���� ���������� water()�� ȣ�� �� �� ����.
		
		fe2 = (FireEngine) car;	// ĳ���� �Ұ���
		fe2.water();	// FireEngine -> Car �̱� ������ ����
						// �ν��Ͻ� ��ü�� Car�̱� ������
						// 5 -> 4
	}
}
