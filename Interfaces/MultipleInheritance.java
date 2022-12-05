package Interfaces;

public class MultipleInheritance implements Printing,Scanning {
	
	public void printDisplay() {
		
		System.out.println("Printing....!!!");
	}
	
	public void scanDisplay() {
		
		System.out.println("Scanning....!!!");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.printDisplay();
		mi.scanDisplay();
	}

}
