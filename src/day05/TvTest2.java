package day05;

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� �ּ� : " + t1);
		System.out.println("t2�� �ּ� : " + t2);
		
		t2 = t1; // ���������� ����Ű�� ���� �ٲ���, �׷��� t1, t2�� ���� ���� ����Ű�� ��
		t1.channel = 7;
		System.out.println("t1�� channel : " + t1.channel); // 7
		System.out.println("t2�� channel : " + t2.channel); // 7
		System.out.println("t1�� �ּ� : " + t1);
		System.out.println("t2�� �ּ� : " + t2);
	}
}
