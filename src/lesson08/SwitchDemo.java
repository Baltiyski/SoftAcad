package lesson08;

import java.util.Scanner;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int intValueOfStr = Integer.valueOf(str);
		switch (intValueOfStr) {
			case 1:case 3: case 5: case 7:case 9: System.out.println("Your number is odd");break;
			case 0:case 2: case 4: case 6:case 8: System.out.println("Your number is even");break;
			default:System.out.println("You have entered a number greater than 9");break;
		}
	}

}
