package lesson23;

public class RunnableDemo {
	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable, "T1");
		Thread t2 = new Thread(myRunnable, "T2");


		
		t1.start();
		t2.start();

		
		t1.interrupt();
			
	}
}
