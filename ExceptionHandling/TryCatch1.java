package ExceptionHandling;

public class TryCatch1 {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		int a[] = {10,20,30,40,50};
		
		try {
			System.out.println(a[5]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println("Exception Handled!!");
		}
		
		System.out.println(3);
	}

}
