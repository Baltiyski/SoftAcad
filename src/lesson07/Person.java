package lesson07;

public class Person {
	public final String name;
	private int age;
	private long personalNumber;
	
	//package/default access
	boolean isMale;
	
	public Person(){
		this.name = "";
	}
	
	public Person(String name){
		this.name = name;
	}
	
	void growUp(){
		age ++;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getPersonalNumber() {
		return personalNumber;
	}
	
	public void setAge(int age) {
		if(age > 100) {
			return;
		}
		this.age = age;
	}
	
	public void setPersonalNumber(final long personalNumber){
		this.personalNumber = personalNumber;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
}
