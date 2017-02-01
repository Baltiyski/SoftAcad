package lesson04;

public class Matrix1 {
	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int[][] matrix = new int[n][m];
		
		
		int number = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[j][i] = ++ number;
			}
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
