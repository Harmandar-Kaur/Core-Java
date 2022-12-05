import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			array[i]=sc.nextInt();  
		} 
		System.out.println("Displaying Array values dynamically!!");
		System.out.println(array[0]);
		System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);
		//System.out.println(array[4]);
		
		System.out.println("======================");
		System.out.println("Displaying Array values using for loop!!");
		
		//for(int j = 0; j < array.length; j++) {
		for(int j = 0; j < n; j++) {
			System.out.println(array[j]);
			
		}
		System.out.println("======================");
		System.out.println("Displaying Array values using for each loop!!");
		//for each
		for(int l : array) {
			System.out.println(l);
		}
		
		//System.out.println("=======================");

//		    double[] numbers = new double[5];
//		    for (int i = 0; i < numbers.length; i++)
//		    {
//		        System.out.println("Please enter number");
//		        numbers[i] = sc.nextDouble();
//		    }
		System.out.println("======================");
		System.out.println("Copying an char array to other array using copy method!!");
		char[] frmArr = {'a','b','c','d','e','f'};
		char[] toArr = new char[4];
		System.arraycopy(frmArr, 0, toArr, 0, 4);
		System.out.println(String.valueOf(toArr));
		System.out.println("======================");
		System.out.println("Copying an array to other array using clone method!!");
		int arr[] = {1,2,3,4,5};
		int newArr[]= arr.clone();
		for(int m : newArr) {
			System.out.println(m);
		}
		System.out.println(arr == newArr);
		
		//System.out.println("======================");
//		System.out.println("Copying an char array to string!!");
//		char[] cArr = {'w','e','l','c','o','m','e'};
//		System.out.println(String.copyValueOf(cArr));
//		
//		String msg="welcome";
//		System.out.println(msg);
	}

}
