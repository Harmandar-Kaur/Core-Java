package Threads;

public class Example3 {
	
	public void run() {
		System.out.println("Scanning!!");
	}
	
	public static void main(String[] args) {
		
		Thread obj = new Thread("Scanning");
		//Example3 e = new Example3();
		//Thread t = new Thread((Runnable) e);
		//t.start();
		obj.start();
		String threadName = obj.getName();
		System.out.println(threadName);
	}

}
