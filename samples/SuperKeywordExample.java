package samples;

class Vehicle {
	
	int speed;
	String VehicleName;
	
	Vehicle() {
		System.out.println("Vehicle Default Constructor Gets Invoked!!");
	}

	public Vehicle(int speed, String VehicleName) {
		super();
		this.speed = speed;
		this.VehicleName = VehicleName;
	}
	
	void getVehicleDetails() {
		System.out.println("Vehicle Running at speed : " + this.speed + " " + "km/hr");
		System.out.println("Vehicle name is : " + this.VehicleName);
	}
	
}

class Bike extends Vehicle {
	
	int bike_speed;
	String bike_name;
	
	Bike() {
		System.out.println("Bike Default Constructor Gets Invoked!!");
	}

	public Bike(int bike_speed, String bike_name) {
		super(bike_speed,bike_name);
		this.bike_speed = bike_speed;
		this.bike_name = bike_name;
	}
	
	void getBikeDetails() {
		super.getVehicleDetails();
		System.out.println("Bike is Running at speed : " + this.bike_speed + " " + "km/hr");
	}
	
}

public class SuperKeywordExample {
	public static void main(String[] args) {
		new Bike();
		Bike b = new Bike(100, "HONDA");
		b.getBikeDetails();
		
	}

}
