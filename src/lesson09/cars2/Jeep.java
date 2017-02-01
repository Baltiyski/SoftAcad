package lesson09.cars2;

import lesson09.cars.Car;

public class Jeep extends Car {
	
	private boolean is4x4On;
	
	public boolean switch4x4() {
		is4x4On = !is4x4On;
		System.out.println("Switching 4x4");
		return is4x4On;
	}
	
	public void driveOffRoad() {
		if(this.getOwner() != null) {
			System.out.println("The car must has owner to be driven");
			return;
		}
		
		System.out.println("Driving offroad");
	}
	
	public void drive(){
		if(!is4x4On){
			switch4x4();
		}
		super.drive();
	}
	
	public String toString() {
		return "model:"+getModel()+"\tprice:"+getPrice();
	}
}
