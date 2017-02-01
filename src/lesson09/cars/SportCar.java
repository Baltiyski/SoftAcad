package lesson09.cars;

public class SportCar extends Car{
	boolean isCabriolet;
	boolean isSportCar;
	double price;
	
	public SportCar(String model, String color, boolean isCabriolet) {
		super(model, true, color);
//		this.model = model;
//		this.color = color;
		this.isSportCar = false;
		this.isCabriolet = isCabriolet;
	}
	
	void switchTurbo() {
		System.out.println("Turbo is on");
	}
}
