package hw06;



class College {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student petar = new Student("Petar", "Informatics", 19);
		Student maq = new Student("Maq", "Informatics", 22);
		Student stoqn = new Student("Stoqn", "Computer Science", 23);
		Student sokolin = new Student("Sokolin", "Obrabotka na zyrneni kulturi", 38);
		
		petar.grade = 5.10;
		sokolin.grade = 3.20;
		maq.upYear();
		
		petar.receiveScholarship(5.0, 120);
		sokolin.receiveScholarship(5.0, 120);
		
		//boolean eqGrades = Student.compareGrades(maq, petar);
		String message = (Student.compareGrades(maq, petar)) ? "has equals grades" : "has different grades";
		System.out.println("Maq and Petar " + message);
		
		StudentGroup group = new StudentGroup("Informatics");
		group.addStudent(maq);
		group.addStudent(petar);
		group.addStudent(sokolin);
		group.addStudent(stoqn);
		
		System.out.println("The best student is: " + group.bestStudent());
		group.printStudentsInGroup();
		
	}

}
