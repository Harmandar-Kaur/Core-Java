package Abstraction;

abstract class Task1 {
	
	void display() {
		System.out.println("Msg from display!!");
	}
	
	abstract void show();
	
}
public class Abstraction extends Task1 {
	
	void show() {
		System.out.println("Msg from show!!");
	}
	
	public static void main(String[] args) {
		
		Abstraction a = new Abstraction();
		a.display();
		a.show();
	}

}
