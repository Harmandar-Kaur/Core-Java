package Threads;

public class Example7 extends Thread {
	
	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex) {
				//ex.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Example5 e = new Example5();
		e.start();
		
		try {
			
			e.join();
		
		} catch(InterruptedException ex) {
			
			ex.printStackTrace();
		}
		
		Example5 e1 = new Example5();
		e1.start();
	}

}
