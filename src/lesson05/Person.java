package lesson05;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person[] friends = new Person[3];
	
	void walk() {
		//method's body
		System.out.println("walking...");
		System.out.println("walking again ...");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void growUp() {
		//modifying the state of the object
		age++;
	}
	
	void drinkWater(double liters, String dayOfWeek) {
		if(liters > 2) {
			System.out.println("Too much water!!!");
		} else {
			System.out.println("It's " + dayOfWeek);
			System.out.println(name + " is drinking " + liters + " liters water");
		}
		
	}
	
//	void drinkWater(String dayOfWeek) {
//		
//		double l = 0.1 * weight;
//		System.out.println("It's " + dayOfWeek);
//		System.out.println(name + " is drinking " + l + " liters water");
//		
//	}
}
