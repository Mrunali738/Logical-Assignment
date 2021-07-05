package MethodOverride;

public class Override {

	public static void main(String[] args) {//method calling from subclass object.
		DerivedClass der = new DerivedClass();
		der.method();//method calling from superclass object.
		BaseClass base = new BaseClass();
		base.method();
		BaseClass base1 = new DerivedClass();
		base1.method();

	}

}
