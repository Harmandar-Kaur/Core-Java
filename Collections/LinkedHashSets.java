package Collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Alex");
		set.add("Alen");
		set.add("John");
		set.add("Zeus");
		set.add("Jimmy");
	
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
