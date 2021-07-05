package Iterator2;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		hs.add("karvenagar");
		hs.add("Pune");
		System.out.println("First HashSet:="+ hs);
		HashSet<String> subset = new HashSet<>();
		subset.add("Java");
		subset.add("J2EE");
		subset.add("Selenium");
		System.out.println("Second HashSet:="+ subset);
		hs.retainAll(subset);//this function retain common element from both hashset.
		System.out.println(""+"Common Hashset contain from both:");
		System.out.println(hs);
	}
}//program for compare two sets and retain elements which are same on both hashsets.
