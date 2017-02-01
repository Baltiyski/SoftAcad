package hw06;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer c1 = new Computer(2009, 300.5,	200, 200);
		Computer c2 = new Computer(2011, 520.8,	true, 200, 200, "Windows 7");
		
		int compare = c1.comparePrice(c2);
		if (compare == -1) {
			System.out.println("Computer 1 has higher price!");
		} else if (compare == 1) {
			System.out.println("Computer 2 has higher price!");
		} else {
			System.out.println("The computers has same price!");
		}
		
		c1.useMemory(100);
		c2.changeOperationSystem("Winndows 98");
	}
}
//2011, 520.8,	true, 200, 200, "Windows 7"
//2009, 300.5,	200, 200