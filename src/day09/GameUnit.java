package day09;

public abstract class GameUnit { // �߻�Ŭ����
	int x, y; // ������ ��ǥ
	abstract void move(int x, int y); // �߻�޼ҵ�
	void stop() { /* ���� ��ġ�� ���� */ } // �Ϲݸ޼ҵ�
	
	/*
	 * 	�߻�Ŭ������ �߻�޼ҵ嵵 ���� �� �ִ�.
	 * 	==> �߻�޼ҵ常 ������ ���� �ƴ� �Ϲݸ޼ҵ嵵 �󸶵��� ������ �����ϴ�.
	 */
}

class Marine extends GameUnit {
	@Override
	void move(int x, int y) {}	// �ڼ�Ŭ�������� �߻�޼ҵ� ����
	
	void stimPack() { /* ������ ��� ��� */ }
}

class Tank extends GameUnit {
	@Override
	void move(int x, int y) {}	// �ڼ�Ŭ�������� �߻�޼ҵ� ����
	
	void changeMode() { /* ������ ��� ��� */ }
}

class DropShip extends GameUnit {
	@Override
	void move(int x, int y) {}	// �ڼ�Ŭ�������� �߻�޼ҵ� ����
	
	void load() { /* ������ ����� ž�½�Ŵ */ }
	void unload() { /* ������ ����� ������Ŵ */ }
}





























