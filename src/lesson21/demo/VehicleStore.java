package lesson21.demo;

import java.util.LinkedList;
import java.util.List;

//public class VehicleStore<Vehicle> { refers to vehicle as a type name
public class VehicleStore<T extends Vehicle> {

	List<T> vehicles = new LinkedList<T>();
	
	public VehicleStore(){
		
	}
	
	public VehicleStore(List<T> list){
		vehicles= list;
	}
	
	public T getFirst(){
		return vehicles.get(0);
	}
	
	public void add(T object){
		vehicles.add(object);
	}
	
	public <T extends Vehicle> boolean isContained(T t){
		return vehicles.contains(t);
	}
	
}
