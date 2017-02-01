package lesson07.godexample;

public class God {
	private final String name;
	
	public God(String name) {
		this.name = name;
	}
	
	public void doSomeMiracle(){
		System.out.println("Miricle");
	}
	
	public String getName(){
		return name;
	}
	
	public void changeWeather(String weather) {
		if(weather.equals("Sunny") || weather.equals("Rainy")){
			System.out.println("Our god " + name + " change weather to " + weather);
		} else {
			System.out.println("I haven't this might :(");
		}
	}
}
