package hw02;

import java.util.Scanner;

public class Zad5 {
	public static void main(String[] args) {
		//first create Scanner and read the numbers
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int first = sc.nextInt();
		
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		
		//check if the first number is smaller than the second one. If it is, swap the values of the numbers
		if(first > second){
			int swap = first;
			first = second;
			second = swap;
		}
		
		for (int i = first; i <= second; i++) {
			System.out.print(i + " ");
		}
	}
}
