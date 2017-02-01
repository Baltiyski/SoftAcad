package lesson21.demo;

public class ClassExplosionDemo {
	
	VehicleStore<Car> cars = new VehicleStore<Car>();
	VehicleStore<Truck> trucks = new VehicleStore<Truck>();
//	VehicleStore<Ship> ships = new VehicleStore<Ship>();//VehicleStore, Ship, Car, Truck
	
	VehicleStoreCar carStore = new VehicleStoreCar();
	// and so on
	//VehicleStoreCars,VehicleStoreShip, VehicleStoreTruck, Ship, Car, Truck
	

}
