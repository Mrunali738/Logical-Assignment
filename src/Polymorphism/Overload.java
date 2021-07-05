package Polymorphism;

public class Overload {
	void demo1(int a) {
		System.out.println("a:"+a);
	}
	void demo(int a,int b) {
		System.out.println("a and b:"+a + ","+b);
	}
	double demo1(double a) {
		System.out.println("double a:"+a);
		return a * a;
	}
	int demo1(int a,int b,int c) {
		return a+b+c;
	}
}
	


