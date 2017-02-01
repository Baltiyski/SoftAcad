package lesson10;

public class RemoteControllersDemo {
	public static void main(String[] args) {
		SonyDVDRemoteController sonyDVDController = new SonyDVDRemoteController();
		sonyDVDController.play();
		
		SamsingDVDRemoteController dvd = new SamsingDVDRemoteController();
	}
}
