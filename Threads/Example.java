package Threads;

public class Example extends Thread {
	
	public void run() {
		System.out.println("Thread Started...");
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		e.start();
	}

}
