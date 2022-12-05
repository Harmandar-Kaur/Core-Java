package Threads;

public class Example8 extends Thread {
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread!");
		} else {
			System.out.println("User Thread!");
		}
	}
	
	public static void main(String[] args) {
		
		Example8 e = new Example8();
		Example8 e1 = new Example8();
		Example8 e2 = new Example8();
		
		e.setDaemon(true);
		e.start();
		e1.start();
		e2.start();
	}

}
