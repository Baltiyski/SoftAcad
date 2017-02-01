package lesson21.demo;

import lesson21.exercise.Mammal;

public class VehicleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VehicleStore<Car> cars = new VehicleStore<Car>();
		VehicleStore<Truck> trucks = new VehicleStore<Truck>();
		VehicleStore<Vehicle> vehicle = new VehicleStore<Vehicle>();
		
		
		Car bmw = new Car();
		Car mc = new Car();
		
		Truck tir = new Truck();
		Truck man = new Truck();
		
		cars.add(bmw);
		trucks.add(tir);
		
		Car newBmw = cars.getFirst();
		Truck newMan = trucks.getFirst();
		viewVehicle(trucks);
		
	}
	
	public static void viewVehicle(VehicleStore<? extends Vehicle> v){
		System.out.println(v.getFirst());
		
	}

}
