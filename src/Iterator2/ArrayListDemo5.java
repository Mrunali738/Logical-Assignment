package Iterator2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("zero");
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		List<String> list = new ArrayList<>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does ArrayList contain all list element?:"+arrl.containsAll(list));
		list.add("one");
		System.out.println("\n Does ArrayList contain all list element?:"+arrl.containsAll(list));
		}
	}//program to find does arraylist contain all list elements or not.
