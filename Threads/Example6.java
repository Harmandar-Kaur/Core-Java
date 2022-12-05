package Threads;

public class Example6 extends Thread {
	
	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Example6 e = new Example6();
		e.run();
	
		Example6 e1 = new Example6();
		e1.run();
	}
}