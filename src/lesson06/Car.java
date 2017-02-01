package lesson06;

public class Car {
	String model;
	double price;
	boolean isSportCar;
	double maxSpeed;
	double currentSpeed;
	String color;
	short gear;
	Person owner;
	
	Car() {
		
	}
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		this.currentSpeed = 0;
		this.gear = 1;
	}
	
	Car(String model, boolean isSportCar, String color, 
			double price, double maxSpeed){
		this(model, isSportCar, color);
		this.price = price;
		if(maxSpeed>200 && !isSportCar){
			this.maxSpeed = 200;
		}else{
			this.maxSpeed = maxSpeed;
		}
	}
	
	boolean isMoreExpensive(Car car) {
		boolean compare = this.price > car.price;
		return compare;
	}
	
	double calculatePriceForScrap(double metalPrice) {
		double coef = 0.2;
		if(isSportCar) {
			coef += 0.05;
		}
		if(color.equals("Black") || color.equals("black")) {
			coef += 0.05;
		}
		return metalPrice * coef;
	}
	
	void changeOwner(Person newOwner){
		//car gets a new owner
		this.owner = newOwner;
		//new owner gets the car
		newOwner.car = this;
		
//		this.owner.car = this;
	}
	
	
}
