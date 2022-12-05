package oops;

public class Static {
	int count = 0;
	static int count1 = 0;
	int num = 0;
	Static() {
		count++;
		count1++;
		System.out.println("Non-Static Varaible: " + count);
		System.out.println("Static Variable: " + count1);
	}
	
	public static void main(String[] args) {
		Static s = new Static();
		Static s1 = new Static();
		Static s2 = new Static();
		//Accessing non-static variable in static method using object
		System.out.println(s.num);
		//System.out.println(Static.num);//inorder to access through class name the variable should be made static
		// if a variable is static only then it can accessed without obj in a static method
		System.out.println(count1);
	}

}
