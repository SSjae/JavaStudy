package day08;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // ĳ���� �Ұ���
		// FireEngine -> Car �̱� ������ ����
		// �ν��Ͻ� ��ü�� Car�̱� ������
		// 5 -> 4
	}
}