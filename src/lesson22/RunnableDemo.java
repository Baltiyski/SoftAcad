package lesson22;

public class RunnableDemo {
	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable, "T1");
		t1.setPriority(10);
		Thread t2 = new Thread(myRunnable, "T2");
		t2.setPriority(8);
		Thread t3 = new Thread(myRunnable, "T3");
		t3.setPriority(5);
		Thread t4 = new Thread(myRunnable, "T4");
		t4.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.interrupt();
		
		
		
		
		
		
	}
}
