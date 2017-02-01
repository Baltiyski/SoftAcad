package hw09;

public class PersonDemo {
	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		final double OVERTIME_HOURS = 2;

		Person[] persons = new Person[ARRAY_LENGTH];

		Person person1 = new Person("Person1", 17, true);
		Person person2 = new Person("Person2", 22, false);

		Student student1 = new Student("Student1", 16, true, 4.5);
		Student student2 = new Student("Student2", 21, false, 5.12);

		Employee employee1 = new Employee("Employee1", 25, true, 53);
		Employee employee2 = new Employee("Employee2", 15, false, 43.7);

		persons[0] = person1;
		persons[1] = student1;
		persons[2] = employee1;
		persons[3] = person2;
		persons[4] = student2;
		persons[5] = employee2;

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				if (persons[i] instanceof Student) {
					((Student) persons[i]).showStudentInfo();
				} else if (persons[i] instanceof Employee) {
					((Employee) persons[i]).showEmployeeInfo();
				} else {
					persons[i].showPersonInfo();
				}
			}
		}

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i] instanceof Employee) {
				System.out.println(persons[i].getName()	+ "'s salary is " + ((Employee) persons[i])	.calculateOvertime(OVERTIME_HOURS));
			}
		}

	}
} // Ne moje da definirame konstruktor bez parametri Student()
// Zashtoto nqmame default konstruktor v klas Person
// moje da se opravi ako definirame dafault konstruktor v klas Perosn