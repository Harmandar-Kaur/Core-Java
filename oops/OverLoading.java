package oops;

class Calculation1 {
	void add(int x, int y) {
		int res;
		res = x + y;
		System.out.println("Addition of two numbers is: " + res);
	}
	void add(double x, double y) {
		double res;
		res = x + y;
		System.out.println("Addition of two numbers is: " + res);
	}
}

public class OverLoading {
	public static void main(String[] args) {
		Calculation1 c = new Calculation1();
		c.add(20.01,29.99);
		c.add(10, 20);
	}
}
