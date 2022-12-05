package Collections;

import java.util.Arrays;

class Pair1 implements Comparable<Pair1> {
	
	String firstname;
	String lastname;
	
	public int compareTo(Pair1 a) {
		if(this.firstname.compareTo(a.firstname)!= 0) {
			return this.firstname.compareTo(a.firstname);
		} else {
			return this.lastname.compareTo(a.lastname);
		}
	}
	
	Pair1(String x, String y) {
		this.firstname = x;
		this.lastname = y;
	}
	
	public String toString() {
		return "Pair1 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}

public class ComparableExample2 {
	public static void main(String[] args) {
		
		int n = 4;
		Pair1 arr[] = new Pair1[n];
		
		arr[0] = new Pair1("Raj", "Kashup");
		arr[1] = new Pair1("Rahul", "Singh");
		arr[2] = new Pair1("Rashmi", "Dubey");
		arr[3] = new Pair1("Rahul", "Jetli");
		
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
