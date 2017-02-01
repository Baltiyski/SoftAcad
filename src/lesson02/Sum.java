package lesson02;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int n;
		int sum = 0; //initializing sum with 0 ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum is " + sum);
	}
}
