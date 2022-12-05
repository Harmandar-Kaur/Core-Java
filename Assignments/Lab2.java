package Assignments;

class Account {
	public Account() {
		System.out.println("Account Class!!");
	}
}
public class Lab2 {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Start!!"); 
		
		try {
			Class c1 = Class.forName("samples.Account1");
			Account account = (Account) c1.newInstance();
		} catch(ClassNotFoundException ex) {
			//ex.printStackTrace();
			System.out.println("Class Not Found Exception-Please Enter An Existing Class!!");
		} catch(IllegalAccessException ex) {
			//ex.printStackTrace();
			System.out.println("Illegal Access Exception!!");
		}
		System.out.println("Stop!");
	}
	

}
