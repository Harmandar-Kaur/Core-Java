package samples;
import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		int i,val = 0;
		int flag = 0;
		System.out.println("Enter a num:");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		val = num/2;
		if(num == 0 || num == 1) {
			System.out.println(num + " is not a prime number!!");
		} else {
			for (i=2; i <= val; i++) {
				if(num % i == 0) {
					System.out.println(num + " is not a prime number!!");
					flag=1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(num + " is a prime number");
			}
		}
	}

}
