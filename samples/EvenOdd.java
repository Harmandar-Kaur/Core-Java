package samples;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter a val:");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		if(val % 2 ==0 ) {
			System.out.println("Even Number!!");
		} else {
			System.out.println("Odd Number!!");
		}
	}

}
