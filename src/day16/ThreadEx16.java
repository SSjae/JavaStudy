package day16;

public class ThreadEx16 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx16();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account { // 계좌클래스
	private int balance = 1000;
	// getter() / setter()
	// alt + shift + s 누른 후 r

	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) { // 임계영역 설정
//	public void withdraw(int money) { // 출금
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx16 implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
}