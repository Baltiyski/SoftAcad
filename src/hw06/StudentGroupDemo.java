package hw06;

public class StudentGroupDemo {
	public static void main(String[] args) {
		StudentGroup group = new StudentGroup("Infromatics");
		
		Student ivan = new Student("Ivanomir", "Mathmetics", 20);
		group.addStudent(ivan);
		
		Student maria = new Student("Maria", "Infromatics", 22);
		maria.grade = 5.5;
		group.addStudent(maria);
		
		group.addStudent(new Student("Joro", "Infromatics", 22));
		
		System.out.println("The best student is " + group.bestStudent());
		group.printStudentsInGroup();
		System.out.println();
	}
}
