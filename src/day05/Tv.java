package day05;

public class Tv { // Tv��� Ŭ����
	// Tv�� �Ӽ� ( ������� )
	String color;	// ����
	boolean power;	// �������� ( on / off )
	int channel;	// ä��
	
	// Tv�� ��� ( �޼ҵ� )
	void power() {
		// Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
		power = !power;
	}
	void channelUp() {
		// Tv�� ä���� ���̴� ����� �ϴ� �޼ҵ�
		++channel;
	}
	void channelDown() {
		// Tv�� ä���� ���ߴ� ����� �ϴ� �޼ҵ�
		--channel;
	}
}