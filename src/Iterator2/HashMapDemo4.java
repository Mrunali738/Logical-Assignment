package Iterator2;

import java.util.HashMap;

public class HashMapDemo4 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();//key and value both are in string type.
		hm.put("one", "Java");
		hm.put("two", "By");
		hm.put("three", "Kiran");
		System.out.println(hm);
		System.out.println("Value of second:="+hm.get("two"));//get element from hasmap using key.
		System.out.println("Is HashMap empty:="+hm.isEmpty());//check hashmap is empty or not.
		hm.remove("three");//delete element from hashmap.
		System.out.println(hm);
		System.out.println("Size of the HahMap:"+hm.size());//size of hashmap.
		}
	}
//simple program for hashmap demo

