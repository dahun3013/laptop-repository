package day12;

public class RunnableEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableEX21 r = new RunnableEX21();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}

class Account{
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		synchronized(this) {
			if(balance>=money) {
				try {Thread.sleep(1000);}catch(InterruptedException e) {};
				balance -= money;
			}
		}
	}
}

class RunnableEX21 implements Runnable{
	Account acc = new Account();
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random()*3+1)*100;
			System.out.println(Thread.currentThread().getName()+"������ money�� "+money);
			acc.withdraw(money);;
			System.out.println(Thread.currentThread().getName()+"���� �ܰ��� balance(�ܰ�) : "+acc.getBalance());
		}
	}
}