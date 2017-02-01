package lesson22;

public class SleepRunnable implements Runnable{

	int interval;
	
	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.println("Print");
			try {
				Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		
		
	}

}
