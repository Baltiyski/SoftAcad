package hw02;

import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		//define accumulate variable
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.print("The sum of the numbers between 1 and " + num + " is " + sum);
	}
}
