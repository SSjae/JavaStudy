package day11;

public class WrapperTest {
	public static void main(String[] args) {
		// object �Ű� ������ �ƹ��ų� �Ѱܶ� ��� �ǹ��̴�.
		
		// �ڽ�
		Integer obj = new Integer(20); // ���� ����
		obj = (Integer) 20;	// �ֽ� ����
		Double obj2 = (Double) 10.24;
		
		// ��ڽ�
		int data = obj.intValue();
		double data2 = obj2.doubleValue();
		System.out.println(data);
		System.out.println(data2);
		System.out.println();
		
		// toString�� Integer���� ������ �Ǳ� ������ obj�� �ϸ� �ּҰ� �ƴ� ��¥ ���� ���´�.
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println();
		
		// ���� �ڽ�
		obj = 100;
		// ���� ��ڽ�
		data = obj;
	}
}