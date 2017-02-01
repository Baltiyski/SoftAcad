package hw09;

public class Employee extends Person{
	private double daySalary;
	private static final int OVERTIME_AGE = 18;
	private static final double OVERTIME_COEFF = 1.5;
	
	protected Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySalary = daySalary;
	}
	
	protected void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}
	
	protected double getDaySalary() {
		return daySalary;
	}
	
	protected double calculateOvertime(double hours) {
		if (hours < 0) {
			System.out.println("Overtime hours can't be negative!");
			return daySalary;
		}
		if (getAge() < OVERTIME_AGE) {
			System.out.println(getName() + " is under 18 yers old. Can't work overtime!");
			return daySalary;
		}
		daySalary = (daySalary/8)*OVERTIME_COEFF*hours + daySalary;
		return daySalary;
	}
	
	protected void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Today salary: " + daySalary);
	}
	
}
