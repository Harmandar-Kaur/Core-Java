package Assignments;

public class Account1 {
	
	int accountId;
	String name;
	double balance;
	
	Account1() {
		System.out.println("Account1 Default Constructor");
	}
	
	Account1(int accountId, String name, double balance) {
		
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}
	
	public static boolean equals(BankApp obj) {
		return true;
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	

}

