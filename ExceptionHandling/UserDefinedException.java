package ExceptionHandling;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}
public class UserDefinedException {
	public static void main(String[] args) {
		
		System.out.println("Begin!!");
		try {
			throw new MyException("My Custom Exception");
		} catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

