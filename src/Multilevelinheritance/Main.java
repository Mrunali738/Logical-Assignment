package Multilevelinheritance;

public class Main {
	

	public static void main(String[] args) {
		Costomer c1 = new Costomer();
			c1.name = "Candid";
			c1.age = 22;
			c1.ph = 1234567891;
			c1.specialization = "java";
		Clerk m1 = new Clerk();
			m1.name = "java";
			m1.age = 25;
			m1.ph = 345689;
			m1.department = "HR";
			
			System.out.println(c1.name);
			System.out.println(c1.age);
			System.out.println(c1.ph);
			System.out.println(c1.specialization);
			
			System.out.println(m1.name);
			System.out.println(m1.age);
			System.out.println(m1.ph);
			System.out.println(m1.department);
	}

}
