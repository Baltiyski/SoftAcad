package lesson16;

public class Car implements Comparable<Car>{
	private String model;
	private int maxSpeed;
	
	Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	public String toString() {
		return "model:"+this.model+ "\t MaxSpeed: " + this.maxSpeed;
	}


	@Override
	public int compareTo(Car car) {
		if(this.getMaxSpeed() > car.getMaxSpeed()) {
			return 1;
		}
		if(this.getMaxSpeed() < car.getMaxSpeed()) {
			return -1;
		}
		return 0;
	}
	

}
