public class IncDec {
	public static void main(String[] args) {
		int n=20;
		int n2=10;
		System.out.println("Increment:");
		System.out.println(n++);
		System.out.println(++n);
		System.out.println("Decrement:");
		System.out.println(n--);
		System.out.println(--n);
		System.out.println(n++ + ++n);
		System.out.println(n2++ + ++n2);
		System.out.println(n++ + n2++);
	}

}
