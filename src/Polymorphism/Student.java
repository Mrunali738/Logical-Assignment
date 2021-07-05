package Polymorphism;

public class Student {
	String name;
	int age;
	String email;
	public void setData(String name,int age) {
		this.name = "shanti";
		this.age = 20;
	}
	public void setData(String name,int age,String email) {
		this.name = "shanti";
		this.age = 20;
		this.email = "veera@candidjava.com";
	}
	public void display() {
		System.out.println("shanti");
		System.out.println(20);
		System.out.println("veera@candidjava.com");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData("shanti", 20);
		s1.display();
		Student s2 = new Student();
		s2.setData("Veera", 23," veera@candidjava.com");
		s2.display();
		}
}
