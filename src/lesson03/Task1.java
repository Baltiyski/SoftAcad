package lesson03;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare an array of 10 elements
		short[] array = new short[10];
		// Initialize 1,2,3 element
		array[0] = 7;
		array[1] = 8;
		array[2] = -23;
		// Print
		System.out.println(array[0]);

		// Change their values
		array[0] = 16;
		// Print
		System.out.println(array[0]);
		
		System.out.println(array);

	}

}
