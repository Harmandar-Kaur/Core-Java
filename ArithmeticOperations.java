public class ArithmeticOperations {
	public int a,b;
	public int addition(int a,int b) {
		this.a = a;
		this.b = b;
		int c = a + b;
		System.out.println("Addition is:" +c);
		return c;
	}
	public int substraction(int a,int b) {
		this.a = a;
		this.b = b;
		int c = a - b;
		System.out.println("Substraction is:" +c);
		return c;
	}
	public int multiplication(int a,int b) {
		this.a = a;
		this.b = b;
		int c = a * b;
		System.out.println("Multiplication is:" +c);
		return c;
	}
	public int division(int a,int b) {
		this.a = a;
		this.b = b;
		int c = a / b;
		System.out.println("Division is:" +c);
		return c;
	}
	public static void main(String[] args) {
		ArithmeticOperations ar = new ArithmeticOperations();
		ar.addition(2,2);
		ar.substraction(4,2);
		ar.multiplication(2,2);
		ar.division(4,2);
	}

}
