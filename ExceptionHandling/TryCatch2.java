package ExceptionHandling;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		String s = "hey";
		
		try {
			System.out.println(s.charAt(9));
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled!!");
		}
	}

}
