package lesson01;
import java.util.Scanner;


public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		
		double age = sc.nextDouble();
		
		System.out.println("The age is " + age);
	}
}
