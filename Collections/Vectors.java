package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		
		Vector<Integer> l1 = new Vector<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
