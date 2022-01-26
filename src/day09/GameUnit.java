package day09;

public abstract class GameUnit { // 추상클래스
	int x, y; // 유닛의 좌표
	abstract void move(int x, int y); // 추상메소드
	void stop() { /* 현재 위치에 정지 */ } // 일반메소드
	
	/*
	 * 	추상클래스는 추상메소드도 가질 수 있다.
	 * 	==> 추상메소드만 가지는 것이 아닌 일반메소드도 얼마든지 선언이 가능하다.
	 */
}

class Marine extends GameUnit {
	@Override
	void move(int x, int y) {}	// 자손클래스에서 추상메소드 정의
	
	void stimPack() { /* 고유한 기술 사용 */ }
}

class Tank extends GameUnit {
	@Override
	void move(int x, int y) {}	// 자손클래스에서 추상메소드 정의
	
	void changeMode() { /* 고유한 기술 사용 */ }
}

class DropShip extends GameUnit {
	@Override
	void move(int x, int y) {}	// 자손클래스에서 추상메소드 정의
	
	void load() { /* 선택한 대상을 탑승시킴 */ }
	void unload() { /* 선택한 대상을 하차시킴 */ }
}





























