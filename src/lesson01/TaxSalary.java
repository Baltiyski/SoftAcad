package lesson01;
import java.util.Scanner;


public class TaxSalary {

	public static void main(String[] args) {
		double salary;
		double tax;
		Scanner sc = new Scanner(System.in);
		salary = sc.nextDouble();
		if (salary <250) {
			System.out.println("The salary is:" + salary);
		} else {
			tax = 0.1 * salary;
			salary = salary - tax;
			System.out.println("The salary is:" + salary);
		}
	}

}
