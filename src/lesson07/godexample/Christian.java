package lesson07.godexample;

public class Christian {
	public static God god = new God("Jesus");
	private String name;
	private int age;
	
	public Christian(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void prayGodToChangeTheWeather(String weather) {
		god.changeWeather(weather);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			this.name = "";
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 100) {
			return;
		}
		this.age = age;
	}
	 
}
