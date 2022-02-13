package day15;

public class ThreadEx7 {
	public static void main(String[] args) {
		ThreadEx7_1 t1 = new ThreadEx7_1();
		ThreadEx7_2 t2 = new ThreadEx7_2();
		
		System.out.println("==== 우선순위 변경 전 ====");
		System.out.println("Priority of t1 : " + t1.getPriority());
		System.out.println("Priority of t2 : " + t2.getPriority());
		
		t1.setPriority(1);
		t2.setPriority(9);
		
		System.out.println("==== 우선순위 변경 후 ====");
		System.out.println("Priority of t1 : " + t1.getPriority());
		System.out.println("Priority of t2 : " + t2.getPriority());
		
		t1.start();
		t2.start();
	}
}

class ThreadEx7_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			for(int x = 0; x < 10000000; x++); // 시간지연 목적
		}
	}
}

class ThreadEx7_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
			for(int x = 0; x < 10000000; x++); // 시간지연 목적
		}
	}
}