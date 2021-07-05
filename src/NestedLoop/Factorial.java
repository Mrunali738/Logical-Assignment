package NestedLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int factorial = 1;
		int i=1;
		while(i<=num) {
	
		factorial = factorial * i;
		i++;
		}
	System.out.println("factorial of "+num+"is...."+factorial);
	}
}
