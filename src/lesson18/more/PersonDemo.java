package lesson18.more;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		
		ivan.watchMovieOnDVD(new IDVDRemoteController() {
			
			@Override
			public void stop() {
				System.out.println("DVD is stoped");
			}
			
			@Override
			public void play() {
				System.out.println("DVD is started");
			}
			
			@Override
			public void insertDisc() {
				//...
			}
			
			@Override
			public void eject() {
				//...
			}
		});
	}
}
