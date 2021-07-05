package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
	public class StuTest {
		public static void main(String[] args) {
			Student ss = new Student(23,"pune",new Phone(2000,9786543));
			Student ss1 = new Student(56,"Nagpur",new Phone(7000,956438));
			Student ss2 = new Student(32,"Mumbai",new Phone(2000,9865332));
			ArrayList<Student> al = new ArrayList<>();
			al.add(ss);
			al.add(ss1);
			al.add(ss2);
			List<Integer> mobNumber = al.stream()
			.map(x -> x.phone)
			.map(y -> y.cost)
			.filter(c -> c>5000);
			.collect(Collectors.toList());
			System.out.println(mobNumber);
			}
		}


