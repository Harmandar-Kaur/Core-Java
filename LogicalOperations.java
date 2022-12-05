public class LogicalOperations {
	public static void main(String[] args) {
		int n = 20;
		int n1 = 25;
		System.out.println(n1 > n && n < n1);
		System.out.println(n1 < 25 && n > 10);
		int res;
		res = (n < n1) ? n:n1; //Ternary Operator
		System.out.println(res);
	}

}
