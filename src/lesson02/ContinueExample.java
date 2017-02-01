package lesson02;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		for (int i = 10; i >= 1; i--) {
			//proverka za 4etnost
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
