package oops;

class Product1 {
	
	String p_name;
	double p_cost;
	int p_qty;
	
	public Product1(String p_name, double p_cost, int p_qty) {
		
		super();
		this.p_name = p_name;
		this.p_cost = p_cost;
		this.p_qty = p_qty;
	}
	
	void getproductDetails() {
		
		System.out.println(this.p_name + " " + this.p_cost + " " + this.p_qty);
	}
}

class Laptop extends Product1 {
	
	public Laptop(String p_name, double p_cost, int p_qty) {
		super(p_name, p_cost, p_qty);
	}
}

class Desktop extends Product1 {
	
	public Desktop(String p_name, double p_cost, int p_qty) {
		super(p_name, p_cost, p_qty);
	}
}

class Tab extends Product1 {
	public Tab(String p_name, double p_cost, int p_qty ) {
		super(p_name, p_cost, p_qty);
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Dell inspiron: ", 75000, 10);
		laptop.getproductDetails();
		
		Desktop desktop = new Desktop("IBM server: ", 90000, 15);
		desktop.getproductDetails();
		
		Tab tab = new Tab("lenovo s7: ", 25000, 20);
		tab.getproductDetails();
		
	}
}
