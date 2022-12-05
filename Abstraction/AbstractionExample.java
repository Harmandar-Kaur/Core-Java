package Abstraction;

abstract class RBI {
	
	void transaction_limit() {
		System.out.println("Allows 50000 only!!");
	}
	
	abstract void roi();
}

class SBI extends RBI {
	
	void roi() {
		System.out.println("Rate of Interest in SBI is : 7%");
	}
}

class ICICI extends RBI {
	
	void roi() {
		System.out.println("Rate of Interest in ICICI is : 9%");
	}
}
public class AbstractionExample {
	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.roi();
	}

}
