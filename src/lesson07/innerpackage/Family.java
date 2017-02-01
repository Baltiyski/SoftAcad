package lesson07.innerpackage;

import lesson07.Person;

public class Family {
	private Person mother;
	private Person father;
	
	public void printFamily(){
		//compilation error 
		//System.out.println("Mother's personNumber is " + mother.personalNumber);
	}
	
	public void increaseMotherAge(){
		//mother.age = 35;
		mother.setAge(35);
		System.out.println("Father's age is " + father.getAge());
	}
	
	
}
