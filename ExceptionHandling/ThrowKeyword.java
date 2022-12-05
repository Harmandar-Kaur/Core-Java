package ExceptionHandling;

public class ThrowKeyword {
	
	static boolean validateNumber(int number) {
		if(number == 0) {
			throw new ArithmeticException("Divisor is zero!!");
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		 int num1 = 20;
		 int num2 = 0;
		 System.out.println("Start");
		 try {
			 if(validateNumber(num2)) {
				 System.out.println(num1/num2);
			 }
		 } catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 System.out.println("Done");
	}
}
