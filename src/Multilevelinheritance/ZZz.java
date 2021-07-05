package Multilevelinheritance;

public class ZZz extends YYy {
	public void methodZZz() {
		System.out.println("Class ZZz method");
	}

	public static void main(String[] args) {
		ZZz obj = new ZZz();
		obj.methodXXx();// calling grand parent class method.
		obj.methodYYy();//calling parent class method.
		obj.methodZZz();//calling local method

	}

}
