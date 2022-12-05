import java.util.Scanner;

public class ConditionalStmts {
	public static void main(String[] args) {
		//Using Conditional if and if-else Statements
		int age;
		System.out.println("Enter Age:");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote!");
		}
		else {
			System.out.println("Not Eligible to vote!");
		}
		
		System.out.println("========================");
		//Using Ternary Operations
		int age1;
		System.out.println("Enter Age:");
		//Scanner sc = new Scanner(System.in);
		age1 = sc.nextInt();
		String res;
		res = (age1 >= 18) ? "Eligible to vote!" : "Not Eligible to vote!";
		System.out.println(res);
		
		System.out.println("========================");
		//Using if-else if-else
		int percentage;
		System.out.println("Enter Percentage:");
		percentage=sc.nextInt();
		if(percentage >= 85 && percentage <= 100) {
			System.out.println("FIRST CLASS WITH DISTINCTION");
		} else if(percentage >= 60 && percentage < 85) {
			System.out.println("FIRST CLASS");
		} else if(percentage >= 35 && percentage < 60) {
			System.out.println("PASS");
		} else if(percentage >= 0 && percentage < 35) {
			System.out.println("FAIL");
		} else {
			System.out.println("PLEASE ENTER PERCENTAGE BETWEEN 0 TO 100");
		}
		
		System.out.println("========================");
		//Using Switch
		System.out.println("Enter a Day:");
		int day = sc.nextInt();
		switch(day) {
			case 1 : System.out.println("Monday");
			        break;
			case 2 : System.out.println("Tuesday");
	        		break;
			case 3 : System.out.println("Wednesday");
	        		break;
			case 4 : System.out.println("Thursday");
	        		break;
			case 5 : System.out.println("Friday");
	        		break;
			case 6 : System.out.println("Saturday");
	        		break;
			case 7 : System.out.println("Sunday");
	        		break;
	        default : System.out.println("Please Enter A Valid Day!!");
	                  break;
		
		}
		
	}
}
