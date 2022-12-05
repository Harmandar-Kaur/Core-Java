package samples;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a val:");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int fact=1;
		for(int i=1; i <= val; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + val + " is:" +fact);
	}
}
