package lesson12;

public class ArrayUtil {
	public static void printArrayInfo(int[] array) {
		try {
			System.out.println("The array lenght is: " + array.length);
			System.out.println("Some text!!!!!!!!!!!!");
			System.out.println("The third element is: " + array[2]);
		} catch (NullPointerException e) {
			System.out.println("The array must not be null!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array must has at least 3 elements");
		}
		
		
		//THIS IS THE RIGHT WAY TO HANDLE THIS PROBLEMS !!!
//		if(array == null) {
//			System.out.println("The array must not be null!");
//			return;
//		}
//		System.out.println("The array lenght is: " + array.length);
//		System.out.println("Some text!!!!!!!!!!!!");
//		if(array.length < 3) {
//			System.out.println("The array must has at least 3 elements");
//		}
//		System.out.println("The third element is: " + array[2]);
		
	}
}
