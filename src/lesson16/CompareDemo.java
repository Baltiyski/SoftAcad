package lesson16;

public class CompareDemo {
	Car bmw = new Car("BMW", 200);
	Car opel = new Car("Opel", 140);
	
	int res1 = bmw.compareTo(opel);
	int res2 = opel.compareTo(bmw);
	
}
