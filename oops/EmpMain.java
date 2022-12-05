package oops;

import java.time.LocalDate;
import java.time.Period;

class Employee {
	int emp_id = 101;
	String emp_name = "Kaur";
	String emp_email = "kaur@gmail.com";
	String emp_dob = "1999-08-27" ;
	
	void getEmpDetails() {
		System.out.println(emp_id + " " + emp_name + " " + emp_email + " " + emp_dob);
	}
	
	void calculateAge() {
		LocalDate dob = LocalDate.parse(emp_dob);
		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		System.out.println(emp_name + " " + "is " + " " + Period.between(dob, curDate).getYears() + " " + " Years Old" );
	}
}

public class EmpMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.getEmpDetails();
		e.calculateAge();
		
	}
}
