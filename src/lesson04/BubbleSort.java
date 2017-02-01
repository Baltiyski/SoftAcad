package lesson04;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {9, 5, 1, 3, 2, 7};
		
		//int count = 0;
		for(int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				//count++;
				if(arr[j] > arr[j + 1]) {
					int buf = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = buf;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//System.out.println();
		//System.out.println("Count = " + count);
	}
}
