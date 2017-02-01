package lesson09.animals;

public class AnimalDemo {
	public static void main(String[] args) {
		Cat jessy = new Cat();
		jessy.age = 2;
		jessy.weight = 5.1;
		jessy.walk();
		jessy.climb();
		
		Bird eagle = new Bird();
		eagle.fly();
	}
}
