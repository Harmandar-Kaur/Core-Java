package oops;
//Fuction Overriding (or) RunTime Polymorphism-same name same return type no parameters 

class Vehicles {
	void display() {
		System.out.println("Vehicle is running!!!");
	}
}

class Bikes extends Vehicles {
	void display() {
		//super.display(); //inorder to print vehicle class display method we can use super keyword
		System.out.println("Bike is running!!!");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Bikes b = new Bikes();
		b.display();
	}

}
