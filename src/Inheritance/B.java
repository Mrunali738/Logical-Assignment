package Inheritance;

public class B extends A {

	void methodB() {
		System.out.println("Child class Method");
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.methodA();  //Calling Super class method
		obj.methodB(); 	//Calling Child class method

	}

}
