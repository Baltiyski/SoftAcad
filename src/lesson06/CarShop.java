package lesson06;

public class CarShop {
	Car[] cars;
	
	CarShop(int capacity) {
		cars = new Car[capacity];
	}
	
	boolean addCar(Car car){
		for(int i=0;i<cars.length;i++){
			if(cars[i] == null){
				cars[i] = car;
				return true;
			}
		}
		return false;
	}
	
	Car getNextCar() {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i] != null){
				return cars[i];
			}
		}
		//not a good practive, but we still don't know about the exceptions :)
		return null;
	}
	
	void sellNextCar(Person buyer) {
		Car carForSold = getNextCar();
		if(carForSold == null) {
			return;
		}
		buyer.buyCar(carForSold);
		//remove car from the car shop
		//removeCar(carForSold)
	}
	
}
