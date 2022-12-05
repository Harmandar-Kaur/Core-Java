package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> l1 = new PriorityQueue<>();
		l1.add("Alex");
		l1.add("Alen");
		l1.add("John");
		l1.add("Jimmy");
		l1.add("Julie");
		//l1.add(null);
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
