package Iterator2;
//program for display arraylist and its operation.
import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		//add elements to the ArrayList al.add("JAVA");al.add("c++");
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);//get elements by index
		System.out.println("Element at index 1:"+al.get(1));
		System.out.println("Does list contain JAVA?"+al.contains("JAVA"));
		//add element at a specific index al.add(2,"PLAY");
		System.out.println(al);
		System.out.println("Is arraylist empty?"+al.isEmpty());
		System.out.println("Index of PERL is"+al.indexOf("PERL"));
		System.out.println("Size of the arraylist is:"+al.size());
	}
}
