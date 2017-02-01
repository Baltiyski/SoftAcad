package lesson03;

import java.util.Scanner;

public class ReadingFromConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = 0;
		do {
			System.out.println("Enter length of the array:");
			length = sc.nextInt();
			if(length % 3 == 0) {
				break;
			}
		} while(true);
		
		int[] arr = new int[length];
		
		
		//reading from console
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value with index " + i);
			arr[i] = sc.nextInt();
		}
		
		//printing to the console
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
