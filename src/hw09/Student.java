package hw09;

public class Student extends Person {
	private double score;

	protected Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;
	}

	protected void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
	}

	protected double getScore() {
		return score;
	}

	protected void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Score: " + score);
	}
}
