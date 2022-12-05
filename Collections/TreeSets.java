package Collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
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
