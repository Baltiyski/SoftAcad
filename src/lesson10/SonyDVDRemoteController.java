package lesson10;

public class SonyDVDRemoteController implements IDVDRemoteController{

	public void play() {
		System.out.println("Welcome to Sony DVD");
	}

	public void eject() {
		System.out.println("Eject");		
	}

	public void insertDisc() {
		System.out.println("Inserting disk into the Sony DVD");
	}

	public void stop() {
		System.out.println("Shutting down Sony DVD");
	}

}
