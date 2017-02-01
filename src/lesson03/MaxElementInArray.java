package lesson03;

import java.util.Scanner;

public class MaxElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		//reading array from the console 
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element with index " + i);
			array[i] = sc.nextInt();
		}
		
		//holds the max element
		int max = array[0];
		//holds the index of the max element
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("The max element is " + max);
		System.out.println("The index of the max element is " + index);
	}
}
