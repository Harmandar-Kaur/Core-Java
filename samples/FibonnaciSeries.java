package samples;
import java.util.Scanner;
public class FibonnaciSeries {
	public static void main(String[] args) {
		int i=0,j=1,k;
		System.out.println("Enter a count value:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println(i);
		System.out.println(j);
		for(i = 2; i <= count; i++) {
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;
		}
	}

}
