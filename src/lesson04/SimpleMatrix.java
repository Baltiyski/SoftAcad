package lesson04;

import java.util.Scanner;

public class SimpleMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows = sc.nextInt();
		System.out.println("Enter columns:");
		int cols = sc.nextInt();
		
		
		int[][] matrix = new int [rows][cols];
		
		int number = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = number++;
			}
		}
		
		//printing the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
