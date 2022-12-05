package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	
public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
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
