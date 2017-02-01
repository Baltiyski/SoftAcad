package lesson10.animals;

public class Cat extends Animal{
	void climb() {
		System.out.println("Climbing...");
	}
	
	public void makeSomeNoise() {
		System.out.println("Myal myal");
	}
	
	@Override
	void walk() {
		System.out.println("Walking like a cat");
	}
}
