package Iterator2;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		System.out.println(hs);
		System.out.println("HashSet is empty or not="+ hs.isEmpty());
		hs.add("Karvenagar");
		System.out.println(hs);
		System.out.println("Size of HashSet="+ hs.size());
		System.out.println("Does HashSet contain first element"+ hs.contains("Java"));
	}
}//program for basic HashSet operation.
