package Threads;

public class Example4 implements Runnable {

	public void run() {
		System.out.println("Scanning!!");
	}
	
	public static void main(String[] args) {
		
		Example4 e = new Example4();
		Thread obj = new Thread(e,"Scanning");
		obj.start();
		//obj.start();
		String threadName = obj.getName();
		System.out.println(threadName);
	}
}
