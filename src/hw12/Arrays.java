package hw12;

public class Arrays {

	public static int[] devideArrays(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length];
//		if (a1.length > a2.length) {
//			a3 = new int[a2.length];
//		} else {
//			a3 = new int[a1.length];
//		}

		for (int i = 0; i < a3.length; i++) {
			try {
				a3[i] = a1[i] / a2[i];
			} catch (ArithmeticException e) {
				a3[i] = 0;
			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
				System.out.println("Index out of bounds");
			}
		}
		return a3;
	}

}
