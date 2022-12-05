package oops;

class Student {
	int roll_no;
	String stud_name;
	int age;
	static String university = "TKR";
	public Student() {
		System.out.println("Default Constructor gets executed!!");
	}
	Student(int roll_no, String stud_name, int age) {
		System.out.println("Parameterised Constructor gets executed!!");
		this.roll_no = roll_no;
		this.stud_name = stud_name;
		this.age = age;
	}
	void getStudDetails() {
		System.out.println(this.roll_no + " " + this.stud_name + " " + this.age + " " + university);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Student s1 = new Student(101, "John", 21);
		s1.getStudDetails();
		Student s2 = new Student(102, "Jimmy", 22);
		s2.getStudDetails();
	}

}
