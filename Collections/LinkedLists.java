package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	
	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Alex");
		l1.add("Alen");
		l1.add("Julie");
		l1.add("Jack");
		l1.add("June");
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
