package oops;

class Company {
	String company_name;
	String company_location;
	
	Company() {
		this.company_name = "IBM";
		this.company_location = "INDIA";
	}
	
	void getCompanyDetails() {
		System.out.println(company_name + " " + company_location);
	}
	
}

class Employees extends Company {
	int emp_id;
	String emp_name;
	
	Employees() {
		this.emp_id = 101;
		this.emp_name ="John";
	}
	
	void getEmpDetails() {
		System.out.println(this.emp_id + " " +this.emp_name);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Employees e = new Employees();
		e.getCompanyDetails();
		e.getEmpDetails();
	}

}
