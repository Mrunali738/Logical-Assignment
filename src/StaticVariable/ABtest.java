package StaticVariable;

public class ABtest {

	public static void main(String[] args) {
		AB aa = new AB();
		aa.a++;
		System.out.println(aa.a);
		AB aa1 = new AB();
		aa1.a++;
		System.out.println(aa1.a);
		AB aa2 = new AB();
		aa2.a++;
		aa2.a++;
		System.out.println(aa2.a);
		System.out.println(aa.a);
		}
}
