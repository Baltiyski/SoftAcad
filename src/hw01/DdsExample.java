package hw01;

import java.util.Scanner;


public class DdsExample {
	public static void main(String[] args) {
		System.out.println("Enter price");
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		double dds;
		dds = price / 5;
		
		System.out.println("DDS is " + dds);
	}
}
