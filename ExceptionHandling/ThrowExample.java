package ExceptionHandling;

public class ThrowExample {
	
	static void validateAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("User Not Eligible To Vote!!");
		} else {
			System.out.println("Eligible To Vote!!");
		}
	}
	public static void main(String[] args) {
		System.out.println("Start");
		validateAge(17);
		System.out.println("Done");
	}

}
