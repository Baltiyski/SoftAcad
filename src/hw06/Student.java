package hw06;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		grade = 4;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	double receiveScholarship(double min, double amount) {
		if((grade >= min) && (age < 30)) {
			this.money += amount;
		}
		return money;
	}
	
	void upYear() {
		if(!isDegree) {
			yearInCollege ++;
			if(yearInCollege == 4){
				isDegree = true;
			}
		} else {
			System.out.println("Degree");
		}
	}
	
	static boolean compareGrades(Student s1, Student s2) {
		boolean equals = s1.grade == s2.grade;
		return equals;
	}

	String getInfo() {
		return "name: " + name + ", subject: " + subject + ", grade: " + grade;
	}	
}
