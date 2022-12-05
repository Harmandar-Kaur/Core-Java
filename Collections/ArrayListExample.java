package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
		
	public static void main(String[] args) {
			
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
			
			//for(int i = 0; i < a.size(); i++) {
				//System.out.println(i);
				//System.out.println(a.get(i));
			//}
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
