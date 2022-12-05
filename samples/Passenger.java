package samples;

class PassengerDetails {
	int p_id,p_age,p_phone;
	String p_name,p_email,p_gender;
	
	PassengerDetails(){
		System.out.println("Passenger Details!!");
	}
	
	PassengerDetails(int p_id, String p_name, int p_age, String p_email, int p_phone, String p_gender) {
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_email = p_email;
		this.p_phone = p_phone;
		this.p_gender = p_gender;
		
	}
	void getPassengerDetails() {
		System.out.println("p_id: " + p_id + "\n" + "p_name: " + p_name + "\n" + "p_age: " + p_age + "\n" + "p_email: " + p_email + "\n" + "p_phone: " + p_phone + "\n" + "p_gender: " + p_gender );
	}
}
public class Passenger {
	public static void main(String[] args) {
		new PassengerDetails();
		PassengerDetails pd = new PassengerDetails(101, "John", 20, "John@gmail.com", 777777777, "Male");
        pd.getPassengerDetails();		
	}
}
