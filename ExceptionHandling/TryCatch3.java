package ExceptionHandling;

public class TryCatch3 {
	public static void main(String[] args) {
		 
		String num = null;
		System.out.println(1);
		try {
			
			System.out.println(num.length());
		
		} catch(ArithmeticException ex) {
			
			ex.printStackTrace();
		
		} catch(NullPointerException ex) {
			
			ex.printStackTrace();
		} finally {
			
			System.out.println("Finally Block Is Executed!!");
		}
		System.out.println(3);
	}

}
