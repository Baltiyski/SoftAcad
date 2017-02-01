package lesson07;

public class AccessTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		//final field cannot be changed
		//p.name = "Martin";
		p.isMale = true;
	}
}
