package Collections;
import java.util.ArrayList;
import java.util.Iterator;

class Demo{
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	void displayValues() {
		for(int i=1;i<=1000;i++) {
			a1.add(i);
		}
		Iterator<Integer> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}	
public class ArrayListExample2 {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.displayValues();
	}

}
