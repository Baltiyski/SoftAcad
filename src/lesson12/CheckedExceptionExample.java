package lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("tsest.txt");
		Scanner fileReader = new Scanner(file);
		
		while (fileReader.hasNextLine()) {
			System.out.println(fileReader.nextLine());
		}
		
		fileReader.close();
	}
}
