package Iterator2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTesting2 {

	public static void main(String[] args) {
		HashMap<String,HashMap<String,ArrayList<String>>> hash = new HashMap<>();
		ArrayList<String> all = new ArrayList<>();
		all.add("pune");
		all.add("nagpur");
		all.add("mumbai");
		ArrayList<String> all2 = new ArrayList<>();
		all2.add("lucknow");
		all2.add("noida");
		ArrayList<String> all3 = new ArrayList<>();
		all3.add("null");
		HashMap<String,ArrayList<String>>hm1 = new HashMap<>();
		hm1.put("Mh", all);
		hm1.put("UP", all2);
		hm1.put("delhi",all3);
		System.out.println(hm1);
		System.out.println("###############################");
		hash.put("India", hm1);
		System.out.println(hash);
		for(String arr1 : hash) {
			System.out.println(arr1);
		}
		Iterator<ArrayList<String>> itr = hash.iterator<>();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
	}
