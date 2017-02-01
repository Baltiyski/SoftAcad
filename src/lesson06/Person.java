package lesson06;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person[] friends;
	double money;
	Car car;
	
	//default constructor
	Person() {
		this.age = 0;
		this.weight = 4.0;
	}
	
	Person(String name, long personalNumber, boolean isMale) {
		this();
		this.name = name;
		this.personalNumber = personalNumber;
		this.isMale = isMale;
		friends = new Person[3];
	}
	
//	void buyCar(Car car) {
//		if(this.money < car.price) {
//			System.out.println("Not enought money");
//			return;
//		}
//		
//		this.car = car;
//		this.money -= car.price;
//		car.owner = this;
//		System.out.println("CONCRAGULATIONS, you have new " + car.model);
//	}
	
	boolean buyCar(Car car) {
		if(this.money < car.price) {
			return false;
		}
		
		this.car = car;
		this.money -= car.price;
		car.owner = this;
		
		return true;
	}
	
	double sellCarForScrap(double metalPrice){
		if(car == null) {
			System.out.println("No car to be sold!");
			return money;
		}
		double priceForScrap = this.car.calculatePriceForScrap(metalPrice);
		this.car = null;
		this.money += priceForScrap;
		
		return money;
	}
}
