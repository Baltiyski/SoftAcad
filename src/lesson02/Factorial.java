package lesson02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(factorial + "=" + factorial + "*" + i);
			factorial = factorial * i;
		}

		System.out.println("The factorial is " + factorial);
	}

}
