package lesson05;

public class Car {
	double maxSpeed;
	double currentSpeed;
	String color;
	short gear;
	Person owner;
	//accelarate: 
	
	void accelarate(){
		currentSpeed += 50;
	}
	
	//changeGearUp
	void changeGearUp(){
		if(gear>=5){
			System.out.println("Switching gear is not possible");
		}else{
			gear++;
		}
	}
	
	//ChangeGearDown
	void changeGearDown(){
		if(gear>=2){
			gear--;
		}
		else{
			System.out.println("Grr");
		}
	}

	//ChangeGear
	void changeGear(short newGear){
		gear = newGear;
	}
	
	void changeColor(String newColor){
		color = newColor;
	}
	//chngeColor
	
}
