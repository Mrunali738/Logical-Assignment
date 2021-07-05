package Simpleinterface;

public class Test1 implements Interface2 {
	public void method1() {
		System.out.println("Implemented method1");
		}
	public void method3() {
		System.out.println("Implemented method3");
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.method1();
		t.method3();
		}

}


