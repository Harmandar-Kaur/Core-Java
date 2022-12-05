package Threads;

public class Example2 implements Runnable {
	
	public void run() {
		System.out.println("Thread Started...");
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		Thread t = new Thread(e);
		e.start();
		//e.start(); //We cannot start same thread twice
	}
}
