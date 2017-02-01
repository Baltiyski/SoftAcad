package lesson05;

public class CarDemo {

	public static void main(String[] args) {
		
		Car bmw = new Car();
		Car otherCar = new Car();
		
		bmw.color = "Red";
		bmw.maxSpeed = 400;
		bmw.gear=6;
		bmw.currentSpeed=10;
		
		Person stanislav = new Person();
		stanislav.name = "Stanislav";
		stanislav.age = 26;
		
		bmw.owner = stanislav;
		
//		System.out.println("The owner of the BMW is " + bmw.owner.name);
		
//		System.out.println("My car is "+ bmw.color + " and has "+ bmw.gear+" gear");
		
		bmw.gear = 2;
//		System.out.println("My car is "+ bmw.color + " and has "+ bmw.gear+" gear");
		
		bmw.accelarate();
		System.out.println(bmw.currentSpeed);
		bmw.changeGearDown();
		System.out.println(bmw.gear);
		bmw.changeGear((short)4);
		System.out.println(bmw.gear);
		
		System.out.println(bmw.color);
		bmw.changeColor("Green");
		System.out.println(bmw.color);
		
	}

}
