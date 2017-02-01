package lesson10;

public class SamsingDVDRemoteController implements IDVDRemoteController{

	@Override
	public void play() {
		System.out.println("play");
		
	}

	@Override
	public void eject() {
		System.out.println("eject");
	}

	@Override
	public void insertDisc() {
		System.out.println("insert");
		
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
	

}
