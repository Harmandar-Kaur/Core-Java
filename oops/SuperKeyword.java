package oops;

class Project {
	
	int project_id;
	String project_name, status;
	
	public Project() {
		System.out.println("Default Project Class Constructor Gets Executed!!");
		this.project_id = 101;
		this.project_name = "Online Shopping Cart";
		this.status = "In Progress";
	}
	
	void getProjectDetails() {
		System.out.println(this.project_id + " " + this.project_name + " " + this.status);
	}
}

class Task extends Project {
	 
	int task_id;
	String task_name;
	String task_status;
	
	public Task(int task_id, String task_name, String task_status) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_status = task_status;
	}
	
	void getTaskDetails() {
		System.out.println(super.project_name);
		super.getProjectDetails();
		System.out.println(this.task_id + " " + this.task_name + " " + this.task_status);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Task t = new Task( 01, "Implement Payment Gateway", "Assigned");
		t.getTaskDetails();
	}

}
