package lesson06;

public class Demo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW 330", true, "Red");
		System.out.println(bmw.color);
		
		Car ford = new Car("Ford Fiesta", false, "Black", 2000, 330);
		System.out.println(ford.model + "'s max speed is " + ford.maxSpeed);
		
		
		Person vankata = new Person("Ivan", 84838493, true);
		vankata.money = 5000;
		Person maria = new Person();
		vankata.friends[0] = maria;
		
		boolean result = bmw.isMoreExpensive(ford);
		if(result) {
			System.out.println(bmw.model + " is more expensive than " + ford.model);
		} else {
			System.out.println(bmw.model + " is NOT more expensive than " + ford.model);
		}
		
		double priceForScrap = bmw.calculatePriceForScrap(2);
		System.out.println("BWM's price for scrap is " + priceForScrap);
		
		boolean hasNewCar = vankata.buyCar(ford);
		if(hasNewCar)
			System.out.println("CONCRAGULATIONS, you have new " + ford.model);
		else
			System.out.println("Not enought money");
		System.out.println(vankata.money);
		
		vankata.sellCarForScrap(200);
		
		CarShop carShop = new CarShop(3);
	}
}
