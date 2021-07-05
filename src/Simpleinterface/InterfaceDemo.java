package Simpleinterface;

public class InterfaceDemo implements InterfaceA,InterfaceB {
	public void myMethod() {
		System.out.println("Multiple inheritance example using interfaces");
	}

	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.myMethod();
	}

}
