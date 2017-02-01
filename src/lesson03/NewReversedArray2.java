package lesson03;

public class NewReversedArray2 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		
		for (int i = 0; i < array.length / 2; i++) {
			int buf = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = buf;
		}
		
		//print the new array in the console
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
