package lesson09.cars2;

import lesson09.cars.Car;;


public class CarsDemo {
	public static void main(String[] args) {
		Car opel = new Car("Opel", false, "Red");
		Jeep j = new Jeep();
		System.out.println(j.toString());
		//error
		//opel.currentSpeed;
	}
}
