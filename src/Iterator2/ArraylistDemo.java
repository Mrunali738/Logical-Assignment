package Iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();//adding elements to the end().
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Aurangabad");
		arrl.add("Nagpur");
		Iterator<String> itr = arrl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}//program to read all elements in ArrayList by using an iteration.
