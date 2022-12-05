package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Deque;

public class Dequeues {
	
	public static void main(String[] args) {
		
		Deque<String> l1 = new ArrayDeque<String>();
		l1.add("Alex");
		l1.add("Alen");
		l1.add("John");
		l1.add("Zeus");
		l1.add("Jimmy");
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
