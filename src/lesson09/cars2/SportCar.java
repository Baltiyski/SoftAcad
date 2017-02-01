package lesson09.cars2;

import lesson09.cars.Car;

public class SportCar extends Car{
	boolean isCabriolet;
	//double price;
	
	public SportCar(String model, String color, boolean isCabriolet) {
		super(model, true, color);
//		this.model = model;
//		this.color = color;
//		this.isSportCar = true;
		this.isCabriolet = isCabriolet;
	}
	
	void switchTurbo() {
		System.out.println("Turbo is on");
	}
}
