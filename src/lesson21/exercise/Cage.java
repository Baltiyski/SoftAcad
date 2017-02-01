package lesson21.exercise;

import java.util.LinkedList;
import java.util.List;

public class Cage<T extends Animal> {
	
	List<T> animals = new LinkedList<T>();
	
	public Cage(){
		
	}
	
	public void add(T animal){
		animals.add(animal);
	}
	
	public T getFirstAnimal(){
		return animals.get(0);
	}
	
	public<U extends Mammal> boolean contains(U u){
		return animals.contains(u);
	}
	
	
}
