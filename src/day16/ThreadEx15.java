package day16;

public class ThreadEx15 {
	public static void main(String[] args) {
		ThreadEx15_1 gc = new ThreadEx15_1();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for(int i = 0; i < 20; i++) {
			requiredMemory = (int)(Math.random() * 10) * 20;
			
			System.out.println(requiredMemory);
			// 필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리가 60%이상을 사용했을 경우 gc를 깨운다.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt(); // gc를 바로 깨우기 사용
				try {
					gc.join(100); // gc()가 실행될 수 있도록 main쓰레드가 0.1초 기다림
				} catch (InterruptedException e) {}
			}
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory : " + gc.usedMemory);
		}
	}
}


class ThreadEx15_1 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	@Override
	public void run() {
		while(true) { // 데몬쓰레드(daemon thread)
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				// 1. sleep후 깨어났을 때 InterruptedException 발생
				// 2. Interrupt줘서 InterruptedException 발생
				System.out.println("Awaken by interrupt()");
			}
			gc();
			System.out.println("Garbage Collected. Free Memory : " + freeMemory());
		}
	}
	
	public void gc() { // 가비지컬렉터(Garbage Collector)를 수행하는 메소드
		usedMemory -= 300; // 메모리 공간확보
		if(usedMemory < 0) {
			usedMemory = 0;
		}
	}
	
	public int totalMemory() { // 최대 사용할 수 있는 메모리 양을 반환하는 메소드
		return MAX_MEMORY;
	}
	
	public int freeMemory() { // 현재 사용할 수 있는 메모리 양을 반환하는 메소드
		return MAX_MEMORY - usedMemory;
	}
}