package collectionframework;

import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
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
