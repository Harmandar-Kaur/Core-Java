package samples;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		String msg;
		System.out.println("Enter a msg:");
		Scanner sc = new Scanner(System.in);
		msg=sc.nextLine();
		StringBuilder in=new StringBuilder();
		in.append(msg);
		in.reverse();
		String rev = in.toString();
		if(msg.equals(rev)) {
			System.out.println("Given String is Palindrome!!");
		} else {
			System.out.println("Given String is not Palindrome!!");
		}
	}
}
