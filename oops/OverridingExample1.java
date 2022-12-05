package oops;

class Billing {
	void calculate(int bill_amt, int discount_amt) {
		int total_amt = bill_amt - discount_amt;
		System.out.println("After discount the total amount is: " + total_amt);
	}
}

class Accounts extends Billing {
	void calculate(int bill_amt, int discount_amt) {
		int tax_amount = 200;
		int total_amt = bill_amt - discount_amt + tax_amount;
		System.out.println("After discount the total amount is: " + total_amt);
	}
}

public class OverridingExample1 {
	public static void main(String[] args) {
		Accounts a = new Accounts();
		a.calculate(1200, 200);	
	}
}
