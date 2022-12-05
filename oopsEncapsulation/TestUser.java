package oopsEncapsulation;

public class TestUser {
	
	public static void main(String[] args) {
		
		User u = new User();
		u.setU_name("John");
		u.setPass("12345");
		System.out.println(u.getU_name());
		System.out.println(u.getPass());
	}

}
