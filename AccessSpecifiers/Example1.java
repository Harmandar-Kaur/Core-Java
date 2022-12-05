package AccessSpecifiers;

class Ex {
	
	protected String val = "Hey!";
}
public class Example1 extends Ex {
	
	private int num = 50;
	
	public static void main(String[] args) {
		
		Example e = new Example();
		//System.out.println(e.number); //Displaying error since the variable is private
		System.out.println(e.number1);
		Example1 e1 = new Example1();
		System.out.println(e1.num); //Private variables can only be accessed in its own class
		System.out.println(e.name); //Default variables can only be accessed in all classes within same package
		System.out.println(e1.val); //Protected Variables can only be accessed by all the child classes 
	
	}

}
