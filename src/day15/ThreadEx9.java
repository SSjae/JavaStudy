package day15;

public class ThreadEx9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();
		
		th1.start();
		th2.start();
		
		try {
			// sleep은 static이라 호출한 쓰레드를 재운다.
//			th1.sleep(2000); // 이래도 정상, static은 클래스, 참조변수 둘다 접근 가능 하기 때문에 정상
			Thread.sleep(2000); // main이 재워짐
		} catch (Exception e) {}
		System.out.println("<<main종료>>");
	}
}

class ThreadEx9_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 종료>>");
	}
}

class ThreadEx9_2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("<<th2 종료>>");
	}
}