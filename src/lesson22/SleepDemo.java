package lesson22;

public class SleepDemo {
	public static void main(String[] args) {
		
		SleepRunnable run = new SleepRunnable();
		Thread t1 = new Thread(run, "t1");	
		t1.start();
		
	
	}
}
