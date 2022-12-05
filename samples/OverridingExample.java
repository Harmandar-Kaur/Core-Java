package samples;

class Vendor {
	void calculate() {
		int order_amt = 8000;
		System.out.println("The order amount is: " + order_amt);
	}
}

class Flipkart extends Vendor {
	void calculate() {
		int order_amt = 10000;
		System.out.println("The order amount is: " + order_amt);
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		f.calculate();	
	}
}
