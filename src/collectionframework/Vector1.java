package collectionframework;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Integer> a1 = new Vector<Integer>();
		a1.add(23);
		a1.add(78);
		a1.add(23);
		a1.add(12);
		a1.add(11);
		a1.add(9);
		a1.add(56);
		System.out.println(a1);
		
		for(int y : a1) {
			System.out.println(y);
	}
		}
}
