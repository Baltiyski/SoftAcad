package lesson15;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = 1L;

	private String model;
	private String color;
	transient Person owner;
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString(){
		return "color:"+color+"\t"+"model:"+model;
	}
	
}
