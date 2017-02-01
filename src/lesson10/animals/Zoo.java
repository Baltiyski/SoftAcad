package lesson10.animals;

public class Zoo {
	private Animal[] animals;
	
	public Zoo(int cages) {
		animals = new Animal[cages];
	}
	
	public void addAnimal(Animal animalToAdd) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animalToAdd;
				return;
			}
		}
		System.out.println("No free places");
	}
	
	public Animal[] getAnimals(){
		return animals;
	}
}
