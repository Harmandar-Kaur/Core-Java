package Abstraction;

abstract class Employee {
	
	void empDetails() {
		
		System.out.println("Employee Details are : John from England");
	}
	
	abstract void salary();
}

class HRDepartment extends Employee {
	
	void salary() {
		System.out.println("Salary Details : Rs 56000");
	}
}

public class AbstractionExample1 {
	
	public static void main(String[] args) {
		
		HRDepartment hr = new HRDepartment();
		hr.empDetails();
		hr.salary();
	}

}
