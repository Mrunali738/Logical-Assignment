package Iterator2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Before actual array list"+arrl);
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		arrl.addAll(list);
		System.out.println("\n After copy array list:"+arrl);
	}
}//program for to add all element of a list to arraylist.
