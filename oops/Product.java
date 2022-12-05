package oops;

class ProdDetails {
	int product_id;
	String product_name;
	int product_qty;
	
	ProdDetails() {
		System.out.println("Default Constructor gets Executed!!");
		product_id = 111;
		product_name = "Laptop";
		product_qty = 8;
	}
	
	void getProdDetails() {
		System.out.println(product_id + " " + product_name + " " + product_qty);
	}
}

public class Product {
	public static void main(String[] args) {
		ProdDetails pd = new ProdDetails();
		pd.getProdDetails();
	}

}
