package Iterator2;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTesting {
	public static void main(String[] args) {
		HashMap<Integer,HashMap<Integer,ArrayList<String>>>hashmap=new HashMap<>();
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("sa");
		ar1.add("sa1");
		ar1.add("sa3");
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("s");
		ar2.add("s1");
		ar2.add("s3");
		HashMap<Integer,ArrayList<String>>hs1=new HashMap<>();
			hs1.put(12, ar1);
			hs1.put(121, ar2);
			System.out.println(hs1);
			System.out.println("#############################");
			hashmap.put(12345,hs1);
			System.out.println(hashmap);
		
		}
}
