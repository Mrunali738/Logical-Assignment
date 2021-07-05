package Com.MIB;

public class MNTest {

	public static void main(String[] args) {
		//scene 1
		M aa = new M();
		System.out.println(aa.a);
		System.out.println(aa.b);
		//System.out.println(aa.c);
		aa.m1();
		aa.m2();
		//aa.m3();
	}

}
	//parent doesn't know about child and we have create c 
	//object of parent so child member are no accessible.