package SimpleConstructor;

public class Hello {
	String name;
	Hello(){
		this.name = "javabykiran";
}
	public static void main(String[] args) {
		Hello obj = new Hello();
		System.out.println(obj.name);
	}

}
