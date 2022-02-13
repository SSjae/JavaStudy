package day16;

import java.util.ArrayList;

public class ThreadWaitEx1 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // ���� �����尡 �����ϴ� ��ü
		
		new Thread(new Cook(table), "COOK1").start(); // �丮�� �߰��ϴ� ������
		new Thread(new Customer(table, "donut"), "CUST1").start(); // donut�� �������� ������
		new Thread(new Customer(table, "buger"), "CUST2").start(); // buger�� �������� ������
		
		Thread.sleep(100);
		System.exit(0);
	}
}

class Table {
	String[] dishNames = {"donut", "donut", "buger"}; // donut�� �� ���� ���´�.
	final int MAX_FOOD = 6; // ���̺� ���� �� �ִ� �ִ� ���� ����
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public void add(String dish) { // ���� �߰� �޼ҵ�
		if(dishes.size() >= MAX_FOOD) { // ���̺� ������ ���� á���� ���̺� ������ �߰����� �ʴ´�.
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) { // ������ �������� �޼ҵ�
		for(int i = 0; i < dishes.size(); i++) {
			if(dishName.equals(dishes.get(i))) { // ������ �丮�� ��ġ�ϴ� �丮�� ���̺��� �����Ѵ�.
				dishes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int dishNum() { return dishNames.length; }
}


class Cook implements Runnable { // ������ �߰��ϴ� ������
	private Table table;
	
	public Cook(Table table) { this.table = table; }
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum()); // ( 0 <= idx <= 2 ) ==> 0,1,2
			table.add(table.dishNames[idx]);
			
			try { Thread.sleep(1); } catch (InterruptedException e) {}
		}
	}
}


class Customer implements Runnable {
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
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

	boolean eatFood() { return table.remove(food); }
}

/*
 * [ �� �ڵ忡�� �߻��� �� �ִ� ���� ]
 * 1. ConcurrentModificationException
 * 		�丮�� �����尡 ������ ���� ���߿� �մԾ����尡 ������ �������� �߱� ������ �߻��ϴ� ����
 * 2. IndexOutOfBoundsException
 * 		�մԾ����尡 ���̺��� ������ ������ ���������� ���߿� �ٸ� �մԾ����尡 ���� ������ ����ä�� ���
 *	1,2���� ���� ���� �Ӱ迵���� �����.
 */

