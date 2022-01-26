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
		
		// 위처럼 GameUnit배열을 만들어서 Marine 20명 생산
		GameUnit[] marineGroup = new GameUnit[20];
		for(int i = 0; i < group.length; i++) {
			marineGroup[i] = new Marine();
			// 자손의 메서드 사용하고 싶을 때
			Marine m2 = (Marine) marineGroup[i];
			m2.stimPack();
		}
		
		/*
		 *  위 코드는 공통조상인 GameUnit클래스 타입의 참조변수 배열을 통해서
		 *  서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있다는 것을 보여주기 위한 것이다.
		 *  다형성에서 배웠듯이 조상클래스의 참조변수로 자손클래스의 인스턴스를 참조하는 것이 가능하기 때문에
		 *  이처럼 조상클래스타입의 배열에 자손클래스의 객체(인스턴스)를 담을 수 있는 것이다.
		 *  여기서 호출되는 move(1,1)은 자손클래스에서 재정의된 메소드가 호출되는 것이다.
		 */
		
		Object[] groups = new Object[4];
		groups[0] = new Marine();
		groups[1] = new Tank();
		groups[2] = new Marine();
		groups[3] = new DropShip();
		
		// Object에는 move가 없기 때문에 오류
//		for(int i = 0; i < groups.length; i++) {
//			groups[i].move(1, 1);
//		}
	}
}
