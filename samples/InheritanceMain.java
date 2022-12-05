package samples;

class Train {
	protected int t_no;
	protected String source,dest,dept_date,dept_time,arrival_date,arrival_time;
	
	Train(){
		System.out.println("Train Class Default Constructor Gets Invoked!!");
	}
	Train(int t_no, String source, String dest, String dept_date, String dept_time, String arrival_date,String arrival_time) {
		this.t_no = t_no;
		this.source = source;
		this.dest = dest;
		this.dept_date = dept_date;
		this.dept_time = dept_time;
		this.arrival_date = arrival_date;
		this.arrival_time = arrival_time;
	}
	void getTrainDetails() {
		System.out.println("=====================================================");
		System.out.println("Train Details!!");
		System.out.println("Train Number: " + t_no + "\n" + "Source: " + source + "\n" + "Destination: " + dest + "\n" + "Depature Date: " + dept_date + "\n" + "Departure Time: " + dept_time + "\n" + "Arrival Date: " + arrival_date + "\n" + "Arrival Time: " + arrival_time);
	}
}

class Passengers extends Train {
	int p_id,p_age,p_phone;
	String p_name,p_email,p_gender;
	
	Passengers(){
		//super();
		System.out.println("Passenger Class Default Constructor Gets Invoked!!");
	}
	
	Passengers(int p_id, String p_name, int p_age, String p_email, int p_phone, String p_gender) {
		super(28563, "HYDERABAD", "JANGAON", "08/11/2022", "16:00", "08/11/2022", "19:00");
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_email = p_email;
		this.p_phone = p_phone;
		this.p_gender = p_gender;
		
	}
	void getPassengerDetails() {
		//super.getTrainDetails();
		System.out.println("=====================================================");
		System.out.println("Passenger Details!!");
		System.out.println("Passenger Id: " + p_id + "\n" + "Passenger Name: " + p_name + "\n" + "Passenger Age: " + p_age + "\n" + "Passenger Email: " + p_email + "\n" + "Passenger Phone: " + p_phone + "\n" + "Passenger Gender: " + p_gender );
	}
}
public class InheritanceMain {
	public static void main(String[] args) {
		new Passengers();
		Passengers p = new Passengers(101, "John", 20, "John@gmail.com", 777777777, "Male");
	    p.getTrainDetails();
	    p.getPassengerDetails();
		
	}
}
