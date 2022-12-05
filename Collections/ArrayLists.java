package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Alex");
		a.add("Alen");
		a.add("Bob");
		a.add("Clement");
		a.add("John");
		
		//for(int i = 0; i < a.size(); i++) {
			//System.out.println(i);
			//System.out.println(a.get(i));
		//}
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
