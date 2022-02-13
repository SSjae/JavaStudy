package day16;

import java.util.ArrayList;

public class ThreadWaitEx3 {
	public static void main(String[] args) throws Exception {
		Table3 Table3 = new Table3(); // ���� �����尡 �����ϴ� ��ü
		
		new Thread(new Cook3(Table3), "Cook31").start(); // �丮�� �߰��ϴ� ������
		new Thread(new Customer3(Table3, "donut"), "CUST1").start(); // donut�� �������� ������
		new Thread(new Customer3(Table3, "buger"), "CUST2").start(); // buger�� �������� ������
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Table3 {
	String[] dishNames = {"donut", "donut", "buger"}; // donut�� �� ���� ���´�.
	final int MAX_FOOD = 6; // ���̺� ���� �� �ִ� �ִ� ���� ����
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { // ���� �߰� �޼ҵ�
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting( Cook3 )");
			
			try {
				wait();				// Cook3 �����带 ��ٸ��� �Ѵ�.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify();	// ��ٸ��� �ִ� CUST�� ����� ����
		System.out.println("Dishes : " + dishes.toString());
	}
		
	public void remove(String dishName) { // ������ �������� �޼ҵ�
		synchronized(this) {
			String name = Thread.currentThread().getName();
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting ( CUST )");
				try {
					wait();		// CUST �����带 ��ٸ��� �Ѵ�.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				// lock�� �ݳ��� �� �ؼ� ��� ���ư�
				// this�� Table3�̱� ������ lock�� �ݳ� �� ���༭ add�� ������ �ȵ�
			}
			
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();	// ���ڰ� �ִ� Cook3�� ����� ����
						return;
					}
				}
				try {
					System.out.println(name + " is waiting( CUST )");
					wait();		// ���ϴ� ������ ���� CUST �����带 ��ٸ��� �Ѵ�.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public int dishNum() { return dishNames.length; }
}


class Cook3 implements Runnable { // ������ �߰��ϴ� ������
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
 * [ �� �ڵ忡�� �߻��� �� �ִ� ���� ]
 * 1. ConcurrentModificationException
 * 		�丮�� �����尡 ������ ���� ���߿� �մԾ����尡 ������ �������� �߱� ������ �߻��ϴ� ����
 * 2. IndexOutOfBoundsException
 * 		�մԾ����尡 ���̺��� ������ ������ ���������� ���߿� �ٸ� �մԾ����尡 ���� ������ ����ä�� ���
 *	1,2���� ���� ���� �Ӱ迵���� �����.
 */

