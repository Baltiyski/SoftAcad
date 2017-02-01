package lesson02;

import java.util.Scanner;

public class DoWhileExample2 {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Make a choice:");
			System.out.println("1. New Game");
			System.out.println("2. Load game");
			System.out.println("3. Exit game");
			choice = sc.nextInt();
		} while (choice != 3);
		
	}
}
