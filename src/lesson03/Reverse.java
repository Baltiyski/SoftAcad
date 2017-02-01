package lesson03;

public class Reverse {
	public static void main(String[] args) {
		int[] array = {5, 6, -10, 12 , 4};
		for(int i = array.length - 1; i >= 0; i--) {
			int number = array[i] * 3;
			System.out.print(number + " ");
		}
	}
}
