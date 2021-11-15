package day11;

public class ThreadEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEX1_1 t1 = new ThreadEX1_1();
		ThreadEX1_2 r = new ThreadEX1_2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}

class ThreadEX1_1 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"!!!!");
		}
	}
}

class ThreadEX1_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+"!!!!");
		}
	}
	
}
