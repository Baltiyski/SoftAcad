package hw07;

public class TaskTest {

	public static void main(String[] args) {
		Employee ivan = new Employee("Ivan");
		ivan.setHoursLeft(8);
		Task task = new Task();
		task.setName("Task 1");
		task.setWorkingHours(10);
		ivan.setCurrentTask(task);
		
		ivan.work();
		ivan.showReport();
	}

}
