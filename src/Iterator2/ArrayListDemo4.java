package Iterator2;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Zero");
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:"+arrl);
		arrl.clear();//this function delete all items from arraylist.
		System.out.println("\n After clear ArrayList:"+arrl);
	}
}
