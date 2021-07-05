package Simpleinterface;

public class ZYX implements MyInterface {
	public void method1() {
		System.out.println("implemented method1");
	}
	public void method2() {
		System.out.println("implemented method2");
	}

	public static void main(String[] args) {
		MyInterface obj = new ZYX();
		obj.method1();
		obj.method2();
	}

}
