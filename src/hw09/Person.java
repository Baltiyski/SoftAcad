package hw09;

public class Person {
	private String name;
	private int age;
	private final boolean isMan;
	
	protected Person(String name, int age, boolean isMan) {
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setAge(int age) {
		this.age = age;
	}
	
	protected int getAge() {
		return age;
	}
	
	protected boolean getIsMan() {
		return isMan;
	}
	
	public void showPersonInfo() {
		System.out.println("Name: " + name + ", age: " + age + ", is man: " + isMan);
	}
	
}
