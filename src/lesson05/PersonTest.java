package lesson05;

public class PersonTest {

	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();

		ivan.name = "Ivan";
		ivan.age = 21;
		ivan.isMale = true;
		ivan.personalNumber = 86213123;
		ivan.weight = 70.5;
		
		Person tanq = new Person();
		tanq.name = "Tatqna";
//		ivan.friend = tanq;
//		
//		System.out.println("Ivan's friend is " + ivan.friend.name);
//		System.out.println("Ivan's friend age:" + ivan.friend.age);
		
		ivan.friends[0] = tanq;
		ivan.friends[1] = maria;
		
		
		System.out.println(ivan.name + " is " + ivan.age + " years old");
		System.out.println("Weight: " + ivan.weight);
		
		ivan.walk();
		ivan.eat();
		tanq.eat();
		
		ivan.growUp();
		System.out.println("Ivan age is:" + ivan.age);
		
		double litersWater = 0.5;
		ivan.drinkWater(litersWater, "Monday");
		ivan.drinkWater(3, "Friday");
		//tanq.drinkWater(0.2);
	}

}
