package hw12;

public class Demo {
	public static void main(String[] args) {
		int[] a1 = { 8, 2, 14, 18, 24, 66, 32, 57, 19 };
		int[] a2 = { 2, 0, 7, 3, 0, 6, 4 };
		int[] b;

		b = Arrays.devideArrays(a1, a2);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
