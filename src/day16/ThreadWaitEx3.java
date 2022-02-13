package day16;

import java.util.ArrayList;

public class ThreadWaitEx3 {
	public static void main(String[] args) throws Exception {
		Table3 Table3 = new Table3(); // 여러 쓰레드가 공유하는 객체
		
		new Thread(new Cook3(Table3), "Cook31").start(); // 요리를 추가하는 쓰레드
		new Thread(new Customer3(Table3, "donut"), "CUST1").start(); // donut을 가져가는 쓰레드
		new Thread(new Customer3(Table3, "buger"), "CUST2").start(); // buger를 가져가는 쓰레드
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Table3 {
	String[] dishNames = {"donut", "donut", "buger"}; // donut이 더 자주 나온다.
	final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식 개수
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { // 음식 추가 메소드
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting( Cook3 )");
			
			try {
				wait();				// Cook3 쓰레드를 기다리게 한다.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify();	// 기다리고 있는 CUST를 깨우기 위함
		System.out.println("Dishes : " + dishes.toString());
	}
		
	public void remove(String dishName) { // 음식을 가져가는 메소드
		synchronized(this) {
			String name = Thread.currentThread().getName();
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting ( CUST )");
				try {
					wait();		// CUST 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				// lock을 반납을 안 해서 계속 돌아감
				// this가 Table3이기 때문에 lock을 반납 안 해줘서 add가 실행이 안됨
			}
			
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();	// 잠자고 있는 Cook3을 깨우기 위함
						return;
					}
				}
				try {
					System.out.println(name + " is waiting( CUST )");
					wait();		// 원하는 음식이 없는 CUST 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public int dishNum() { return dishNames.length; }
}


class Cook3 implements Runnable { // 음식을 추가하는 쓰레드
	private Table3 Table3;
	
	public Cook3(Table3 Table3) { this.Table3 = Table3; }
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * Table3.dishNum()); // ( 0 <= idx <= 2 ) ==> 0,1,2
			Table3.add(Table3.dishNames[idx]);
			
			try { Thread.sleep(10); } catch (InterruptedException e) {}
		}
	}
}


class Customer3 implements Runnable {
	private Table3 Table3;
	private String food;
	
	public Customer3(Table3 Table3, String food) {
		this.Table3 = Table3;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(100); } catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			Table3.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

/*
 * [ 위 코드에서 발생할 수 있는 오류 ]
 * 1. ConcurrentModificationException
 * 		요리가 쓰레드가 음식을 놓는 도중에 손님쓰레드가 음식을 가져가려 했기 때문에 발생하는 예외
 * 2. IndexOutOfBoundsException
 * 		손님쓰레드가 테이블의 마지막 음식을 가져가려는 도중에 다른 손님쓰레드가 먼저 음식을 낚아채는 경우
 *	1,2번을 막기 위해 임계영역을 만든다.
 */

