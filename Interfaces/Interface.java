package Interfaces;
//Inorder to implement 100% Abstraction & Multiple Inheritance we make use Interfaces

interface I1 {
	abstract void show();
	         void display(); //by default it is abstract as all methods declared in interfaces are abstracted
}

interface I2 {
	abstract void show1();
	         void display1(); //by default it is abstract as all methods declared in interfaces are abstracted
}

public class Interface implements I1,I2 {
	
	public void show() {
		
		System.out.println("Msg from show!!");
	}
	
	public void display() {
		
		System.out.println("Msg from display!!");
	}
	public void show1() {
		
		System.out.println("Msg from show1!!");
	}
	
	public void display1() {
		
		System.out.println("Msg from display2!!");
	}
	
	public static void main(String[] args) {
		
		Interface i = new Interface();
		i.display();
		i.show();
		i.display1();
		i.show1();
	}

}
