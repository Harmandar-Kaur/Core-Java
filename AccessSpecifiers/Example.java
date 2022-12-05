package AccessSpecifiers;

public class Example {
	
	private int number = 10;
	public int number1 = 20;
	String name = "John"; //default variable
	public static void main(String[] args) {
		
		Ex e = new Ex();
		System.out.println(e.val); //Protected variable can be accessed within a same package by all classes 
	}
}
