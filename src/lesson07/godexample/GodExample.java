package lesson07.godexample;

public class GodExample {

	public static void main(String[] args) {
		God jesus = new God("Jesus");
		God allah = new God("Allah");
		God myGod = jesus;
		
		System.out.println("My god is " + myGod.getName());
		
		Christian ivan = new Christian("Ivan4o", 20);
		Christian maria = new Christian("Ana Maria", 25);
		
		ivan.prayGodToChangeTheWeather("Snow");
		maria.prayGodToChangeTheWeather("Sunny");
		
		//not so good
		//maria.god = allah;
		Christian.god = allah;
		System.out.println("Ivan's god is " + ivan.god.getName());
	}

}
