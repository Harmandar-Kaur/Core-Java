package samples;
import java.util.Scanner;
public class PosNeg {
	public static void main(String[] args) {
		System.out.println("Enter a val:");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		if(val > 0) {
			System.out.println("Positive Number");
		} else {
			System.out.println("Negative Number");
		}
	}
}
