package samples;

import java.util.Scanner;

public class ArrayTests {
	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("Display char at string");
		String str = "Welcome";
		int index1=str.charAt(0);
		int index2=str.charAt(5);
		System.out.println("character at 0:" + (char)index1);
		System.out.println("character at 5:" + (char)index2);
		System.out.println("=========================");
		System.out.println("Display string in array at given index");
		String[] msg = new String[] {"Hey","Hi","Hello","Bye"};
		System.out.println(msg[0]);
		System.out.println(msg[3]);
		System.out.println("=========================");
		System.out.println("Display all elements in array");
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
		for(int j = 0; j < n; j++) {
			System.out.println(array[j]);
			
		}
		System.out.println("=========================");
		System.out.println("Copy elments of one array to another");
		int arr[] = {1,2,3,4,5};
		int newArr[]= arr.clone();
		for(int m : newArr) {
			System.out.println(m);
		}
	}

}
