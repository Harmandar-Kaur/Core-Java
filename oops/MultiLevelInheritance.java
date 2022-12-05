package oops;

class RBI {
	String roi_rbi = "7%";
	RBI() {
		System.out.println("RBI Default Constructor gets executed!!");
	}
	
}

class SBI extends RBI {
	String roi_sbi = "9%";
	SBI() {
		super();
		System.out.println("SBI Default Constructor gets executed!!");
	}
	
}

class HDFC extends SBI {
	String roi_hdfc = "11%";
	HDFC() {
		super();
		System.out.println("RBI Default Constructor gets executed!!");
	}
	
	void getAllDetails() {
		System.out.println("RBI Rate Of Interest Is(roi) is: " + roi_rbi);
		System.out.println("SBI Rate Of Interest Is(roi) is: " + roi_sbi);
		System.out.println("HDFC Rate Of Interest Is(roi) is: " + roi_hdfc);
	}
	
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.getAllDetails();
	}

}
