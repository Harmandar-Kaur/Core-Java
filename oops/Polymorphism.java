package oops;
//Function Overloading or Compile Time Polymorphism  Using Polymorphism Concept 
class Calculation {
	void add(int x, int y) {
		int res;
		res = x + y;
		System.out.println("Addition of two numbers is: " + res);
	}
	void add(int x, int y, int z) {
		int res;
		res = x + y + z;
		System.out.println("Addition of two numbers is: " + res);
	}
	void add(double x, double y) {
		double res;
		res = x + y;
		System.out.println("Addition of two numbers is: " + res);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		c.add(10, 5);
		c.add(1, 2, 3);
		c.add(20.01,29.99);
	}

}
