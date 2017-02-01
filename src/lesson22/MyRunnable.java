package lesson22;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
				System.out.println("Sleeping");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
