package hw05;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc = new Computer();
		Computer nb = new Computer();

		pc.year = 2010;
		pc.price = 300;
		pc.isNotebook = false;
		pc.hardDiskMemory = 500;
		pc.freeMemory = 500;
		pc.operationSystem = "Linux";

		nb.year = 2011;
		nb.price = 700;
		nb.isNotebook = true;
		nb.hardDiskMemory = 320;
		nb.freeMemory = 320;
		nb.operationSystem = "Windows 7";

		System.out.println("Current memory is: " + pc.freeMemory);
		pc.useMemory(200.5);
		System.out.println("Current memory is: " + pc.freeMemory);

		System.out.println("Current OS is: " + nb.operationSystem);
		String newOS = "Linux"; //new String("Linux")
		nb.changeOperationSystem(newOS);
		System.out.println("Current OS is: " + nb.operationSystem);

	}

}
