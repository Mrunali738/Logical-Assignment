package collectionframework;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(10, "India");
		hm.put(34, "India1");
		hm.put(10, "India2");
		hm.put(23, "India3");
		hm.put(56, "India4");
		hm.put(67, "India5");
		hm.put(56, "India6");
		hm.put(10, "India7");
		hm.put(12, "India8");
		System.out.println(hm);
	}
}
