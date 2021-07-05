package Iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTesting2 {
public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(34);
		al1.add(34);
		al1.add(34);
		al1.add(34);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(34);
		al2.add(34);
		al2.add(34);
		al2.add(34);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(34);
		al3.add(34);
		al3.add(34);
		al3.add(34);
		al.add(al1);
		al.add(al2);
		al.add(al3);
		System.out.println(al);
		for(ArrayList<Integer>arr :al) {
			System.out.println(arr);
			}
		Iterator<ArrayList<Integer>> ltr = al.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}
}
