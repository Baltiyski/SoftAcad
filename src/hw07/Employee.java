package hw07;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.equals("")){
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if(currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if(hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
	
	public void work() {
		int taskWorkingHours = currentTask.getWorkingHours();
		int hoursForWork = taskWorkingHours;
		if(hoursLeft < currentTask.getWorkingHours()) {
			hoursForWork = hoursLeft;
		}
		
		hoursLeft -= hoursForWork;
		currentTask.setWorkingHours(taskWorkingHours - hoursForWork);
	}
	
	public void showReport() {
		System.out.println("Employee name: " + name);
		System.out.println("Current task: " + currentTask.getName());
		System.out.println("Employee's hours left for today: " + hoursLeft);
		System.out.println("Current task need " + currentTask.getWorkingHours() + " working hours to be completed");
	}
}

