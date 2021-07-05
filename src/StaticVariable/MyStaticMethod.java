package StaticVariable;

public class MyStaticMethod {
	private String name;
		private static String staticstr = "STATIC-STRING";
		public MyStaticMethod(String n) {
			this.name = n;
		}
		public static void teststaticmethod() {
			System.out.println("Hey...Iam in static method...");//you can call static variables here.
			System.out.println(MyStaticMethod.staticstr);//you can not call instance variables here.
		}
		public static void testobjectmethod() {
			System.out.println("Hey I am non-static method");//you can call static variables here.
			System.out.println(MyStaticMethod.staticstr);//you can call instance variables here.
			System.out.println("Name:"+"this.name");
			}
		public static void main(String[] args) {//by using class name you can call static method.
		MyStaticMethod.teststaticmethod();
		MyStaticMethod msm = new MyStaticMethod("java2novice");
		msm.testobjectmethod();
		}
}
