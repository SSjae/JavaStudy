package day05;

public class TvTest {
	public static void main(String[] args) {
		Tv t; // Tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		
		t = new Tv(); // Tv�ν��Ͻ��� ����
		
		t.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �����Ѵ�.
		
		System.out.println("channel : " + t.channel);
		
		t.channelDown(); // Tv�ν��Ͻ��� �޼ҵ� channelDown()�� ȣ��
		System.out.println("channel : " + t.channel);
	}
}
