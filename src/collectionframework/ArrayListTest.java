package collectionframework;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(23);
		a1.add(78);
		a1.add(23);
		a1.add(12);
		a1.add(11);
		a1.add(9);
		a1.add(56);
		System.out.println(a1);
		System.out.println(a1.size());
		
		for(int y : a1) {
			System.out.println(y);
		}
	}

}
