package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
public static void main(String[] args) {
		
		Stack<Integer> l1 = new Stack<>();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(50);
		
		l1.pop();
		//System.out.println(l1.pop());
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
