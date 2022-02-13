package day15;

public class ThreadEx2 {
	public static void main(String[] args) {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
		
		System.out.println("main");
		System.out.println("main");
	}
}

class ThreadEx2_1 extends Thread {
	@Override
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
