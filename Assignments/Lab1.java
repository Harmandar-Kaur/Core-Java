package Assignments;

public class Lab1 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;
		System.out.println("Start");
		try {
			double d = (double) (num / num2);
			System.out.println(d);
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Division By Zero Error!!");
		}
		System.out.println("Stop");
	}
	
	

}
