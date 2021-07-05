package Array;

public class Program {

	public static void main(String[] args) {
		//create int array.
		int[] array = new int[5];
		//Assign first three elements.
		array[0] = 1;
		array[1] = 10;
		array[2] = 100;
		//loop over elements.
		for(int i=0; i< array.length;i++) {//get value
			int value = array[i];
			//print value
			System.out.println(value);
		}
	}
}//java program that uses array 
