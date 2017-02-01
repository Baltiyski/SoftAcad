package hw06;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	Computer () {
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double 
			 hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.freeMemory = freeMemory;
		this.hardDiskMemory = hardDiskMemory;
	}

	Computer(int year, double price, boolean isNotebook,
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	void useMemory(double memory){
		if(memory > freeMemory){
			System.out.println("Not enough memory");
		} else {
			freeMemory -= memory;
		}
	}
	
	int comparePrice(Computer c){
		if(this.price > c.price){
			return -1;
		} else if (price == c.price){
			return 0;
		}
		return 1;
	}
	
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	
}
