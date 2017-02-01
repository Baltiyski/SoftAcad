package lesson10.animals;

public class Bird extends Animal {
	double flyingSpeed;
	
	void fly() {
		System.out.println("Flying...");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Piy piy...");
	}
	
	@Override
	void walk() {
		System.out.println("Walking like a bird");
	}
	
	public void sing() {
		System.out.println("Singing...");
	}
}
