package lesson16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW", 200);
		Car opel = new Car("Opel", 150);
		Car nisan = new Car("Nisan", 400);
		
		HashSet<Car> hasSet = new HashSet<Car>();
		
		hasSet.add(bmw);
		hasSet.add(opel);
		hasSet.add(bmw);
		
		System.out.println(hasSet.size());
		
		TreeSet<Car> treeSet = new TreeSet<Car>();
		
		treeSet.add(nisan);	
		treeSet.add(opel);	
		treeSet.add(bmw);
		
		System.out.println("First: " + treeSet.first());

		Iterator<Car> it = treeSet.iterator();
		while(it.hasNext()) {
			Car car = it.next();
			System.out.println(car.toString());
		}
		
		System.out.println(treeSet.size());
	}
}
