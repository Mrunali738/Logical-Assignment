package Iterator2;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("first", "Java");
		hm.put("second", "By");
		hm.put("third", "Kiran");
		System.out.println(hm);
		Set<String> Keys = hm.keySet();
		for(String key: Keys) {
			System.out.println("Value of"+key+ "is:"+hm.get(Keys));
		}
	}
}//program for iterating through each key get corresponding value object.
