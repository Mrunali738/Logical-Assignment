package Iterator2;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<>();
		arrl.add("Pune");
		arrl.add("Mumbai");
		arrl.add("Delhi");
		arrl.add("Nagpur");
		System.out.println("Actual ArrayList:"+arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("/n Created Array contain:");
		for(String str:strArr) {
			System.out.println(str);
		}
	}
}//program for to copy ArrayList into array.
