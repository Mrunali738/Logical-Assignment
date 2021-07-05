package Iterator2;

import java.util.ArrayList;
public class ArrayListTesting {

	public static void main(String[] args) {
		ArrayList<Student2> alstu = new ArrayList<>();
		Student2 stu = new Student2(12,"pune",new Phone2(232,4000));
		Student2 stu1 = new Student2(12,"pune",new Phone2(232,8000));
		Student2 stu2 = new Student2(12,"pune",new Phone2(232,14000));
		Student2 stu3 = new Student2(12,"pune",new Phone2(232,3000));
		alstu.add(stu);
		alstu.add(stu1);
		alstu.add(stu2);
		alstu.add(stu3);
		for(Student2 student: alstu) {
			Phone2 pp = student.phone;
			System.out.println(student.age);
			System.out.println(student.loc);
			System.out.println(pp.mobNumber);
			System.out.println(pp.cost);
		}
	}
}
