package hw02;

import java.util.Scanner;

public class Zad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		int number = n - 1;
		for (int i = 0; i < n; i++) {
			// printing line
			for (int j = 0; j < n; j++) {
				System.out.print(number);
			}
			System.out.println();
			number = number + 2;
		}
	}
}
