package oops;

class Sports {
	
	String sport_name;
	
	public Sports(String sport_name) {
		super();
		this.sport_name = sport_name;
		System.out.println("Sports Constructor");
	}
	
	void getSportDetails() {
		System.out.println(this.sport_name);
	}
}

class BasketBall extends Sports {
	
	public BasketBall(String sport_name) {
		super(sport_name);
		System.out.println("BasketBall Constructor");
	}
}

class Hockey extends Sports {
	
	public Hockey(String sport_name) {
		super(sport_name);
		System.out.println("Hockey Constructor");
	}
}

class BaseBall extends BasketBall {
	
	public BaseBall(String sport_name) {
		super(sport_name);
		System.out.println("BaseBall Constructor");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		//Hockey h = new Hockey("HOCKEY");
		//h.getSportDetails();
		BaseBall b= new BaseBall("Basketball");
		b.getSportDetails();
	}

}
