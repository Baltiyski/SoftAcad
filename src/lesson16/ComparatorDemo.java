package lesson16;

public class ComparatorDemo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW", 200);
		Car opel = new Car("Opel", 100);

		CarComparator carComparator = new CarComparator();
		int result = carComparator.compare(bmw, opel);
		System.out.println(result);
	}

}
