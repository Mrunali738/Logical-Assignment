package MethodOverride;

public class SubClass extends BindDynamic {
	void display(String str) {
		if(val == null) {
			str = "Derived class function".concat(str);
			System.out.println(str);
		}
	}

}
