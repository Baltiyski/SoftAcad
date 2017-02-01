package lesson21.exercise;

import lesson21.demo.*;;

public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cage<Mammal> mammalCage = new Cage<Mammal>();
		Cage<Bird> birdCage = new Cage<Bird>();
		Cage<Animal> animals = new Cage<Animal>();
		Animal animal = new Mammal();
		
		Bird eagle = new Bird();
		Mammal lion= new Mammal();
		Car car = new Car();
		
		mammalCage.add(lion);
		birdCage.add(eagle);
		
		animals.add(lion);
		animals.add(eagle);
		
		birdCage.contains((Mammal)animal);

		Bird isEagle = birdCage.getFirstAnimal();
		System.out.println(isEagle);
	}

}
