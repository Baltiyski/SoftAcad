package lesson10.animals;

public class ZooDemo {

	public static void main(String[] args) {
		Dog rex = new Dog();
		Cat jesy = new Cat();
		Animal tweety = new Bird();
		
		Zoo zoo = new Zoo(10);
		zoo.addAnimal(rex);
		zoo.addAnimal(jesy);
		zoo.addAnimal(tweety);
		
		Animal[] animals = zoo.getAnimals();
		for(int i=0;i<animals.length;i++){
			if(animals[i]!=null) {
				//System.out.println(animals[i].getClass().getName());
				animals[i].walk();
				animals[i].makeSomeNoise();
				if(animals[i] instanceof Dog) {
					((Dog)animals[i]).bringStick();
				} else if (animals[i] instanceof Bird) {
					((Bird)animals[i]).sing();
				}
			}
		}
		
		
	}

}
