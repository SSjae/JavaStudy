package day15;

public class ThreadEx4 {
	public static void main(String[] args) {
		// 멀티쓰레드 소요시간 확인, 작업전환(context switching)
		// 왔다 갔다 하면서 멀티로 실행
		
		ThreadEx4_1 t1 = new ThreadEx4_1();
		t1.start();
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx4_1 extends Thread {
	long threadEx4StartTime = System.currentTimeMillis();
	
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - threadEx4StartTime));
	}
}