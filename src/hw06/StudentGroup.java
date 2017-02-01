package hw06;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		groupSubject = subject;
	}
	
	void addStudent(Student s) {
		//s.subject == groupSubject NE TAKA!!!
		
		if(!s.subject.equals(groupSubject)) {
			System.out.println("Wrong group!");
			return;
		}
		if(freePlaces == 0) {
			System.out.println("There is no free place for this course!");
			return;
		}
		students[5 - freePlaces] = s;
		freePlaces --;
	}
	
	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	String bestStudent(){
		if(students[0] == null) {
			return "";
		}
		Student bestStudent = students[0];
		
		for (int i = 1; i < students.length - freePlaces; i++) {
			if (bestStudent.grade < students[i].grade){
				bestStudent = students[i];
			}
		}
		
		return bestStudent.name;
	}
	
	void printStudentsInGroup() {
		for (Student s : students) {
			 if(s != null) {
				 System.out.println(s.getInfo());
			 }
			 System.out.println();
		}
	}
	
}
