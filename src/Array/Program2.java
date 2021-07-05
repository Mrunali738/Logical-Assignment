package Array;

public class Program2 {

	public static void main(String[] args) {
		boolean[] values = { false,true,true,true};
		//loop over array elements in reverse order.
		for(int i = values.length-1;i>=0;i--) {
			System.out.println(values[i]);
		}
	}
}
