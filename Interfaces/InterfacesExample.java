package Interfaces;

interface Billing {
	
	void invoice_amount();
}

public class InterfacesExample implements Billing {
	
	public void invoice_amount() {
		
		System.out.println("Total Invoice Amount is : 40000");
	}
	
	public static void main(String[] args) {
		
		InterfacesExample ae = new InterfacesExample();
		ae.invoice_amount();
		
	}
}
