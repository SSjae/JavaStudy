package day16;

import java.util.ArrayList;

public class ThreadWaitEx2 {
	public static void main(String[] args) throws Exception {
		Table2 Table2 = new Table2(); // ���� �����尡 �����ϴ� ��ü
		
		new Thread(new Cook2(Table2), "Cook21").start(); // �丮�� �߰��ϴ� ������
		new Thread(new Customer2(Table2, "donut"), "CUST1").start(); // donut�� �������� ������
		new Thread(new Customer2(Table2, "buger"), "CUST2").start(); // buger�� �������� ������
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

class Table2 {
	String[] dishNames = {"donut", "donut", "buger"}; // donut�� �� ���� ���´�.
	final int MAX_FOOD = 6; // ���̺� ���� �� �ִ� �ִ� ���� ����
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) { // ���� �߰� �޼ҵ�
		if(dishes.size() >= MAX_FOOD) { // ���̺� ������ ���� á���� ���̺� ������ �߰����� �ʴ´�.
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) { // ������ �������� �޼ҵ�
		synchronized(this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting");
				try { Thread.sleep(500); } catch (InterruptedException e) {}
				// lock�� �ݳ��� �� �ؼ� ��� ���ư�
				// this�� Table2�̱� ������ lock�� �ݳ� �� ���༭ add�� ������ �ȵ�
			}
		}
		
		for(int i = 0; i < dishes.size(); i++) {
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int dishNum() { return dishNames.length; }
}


class Cook2 implements Runnable { // ������ �߰��ϴ� ������
	private Table2 Table2;
	
	public Cook2(Table2 Table2) { this.Table2 = Table2; }
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * Table2.dishNum()); // ( 0 <= idx <= 2 ) ==> 0,1,2
			Table2.add(Table2.dishNames[idx]);
			
			try { Thread.sleep(100); } catch (InterruptedException e) {}
		}
	}
}


class Customer2 implements Runnable {
	private Table2 Table2;
	private String food;
	
	public Customer2(Table2 Table2, String food) {
		this.Table2 = Table2;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(10); } catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			if(eatFood()) {
				System.out.println(name + " ate a " + food);
			}else {
				System.out.println(name + " failed to eat.");
			}
		}
	}

	boolean eatFood() { return Table2.remove(food); }
}

/*
 * [ �� �ڵ忡�� �߻��� �� �ִ� ���� ]
 * 1. ConcurrentModificationException
 * 		�丮�� �����尡 ������ ���� ���߿� �մԾ����尡 ������ �������� �߱� ������ �߻��ϴ� ����
 * 2. IndexOutOfBoundsException
 * 		�մԾ����尡 ���̺��� ������ ������ ���������� ���߿� �ٸ� �մԾ����尡 ���� ������ ����ä�� ���
 *	1,2���� ���� ���� �Ӱ迵���� �����.
 */

