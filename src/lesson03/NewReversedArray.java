package lesson03;

public class NewReversedArray {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6};
		
		int[] array2 = new int[array1.length];
		
		for (int i = 0; i < array1.length / 2; i++) {
			array2[array1.length - 1 - i] = array1[i];
		}
		
		//print the new array in the console
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
