public class Example3 {
	static int result;
	static void add(int x,int y) {
		result = x + y;
		System.out.println("Addition:" + result);
	}
	static void sub(int x,int y) {
		result = x - y;
		System.out.println("Substraction:" + result);
	}
	static int mul(int x,int y) {
		result = x * y;
		//System.out.println("Multiplication:" + result);
		return result;
	}
	static int div(int x,int y) {
		result = x / y;
		//System.out.println("Division:" + result);
		return result;
	}
	public static void main(String[] args) {
		add(2,2);
		sub(5,4);
		result = mul(8,2);
		System.out.println("Multiplication:" + result);
		result = div(20,5);
		System.out.println("Division:" + result);
		System.out.println("Multiplication:" + mul(9,9));
		
	}
}
