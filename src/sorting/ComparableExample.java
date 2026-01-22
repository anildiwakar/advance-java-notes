package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s1=new Student("Ram",25);
		Student s2=new Student("Ajay",35);
		Student s3=new Student("Vijay",50);
		Student s4=new Student("Aniket",27);
		Student s5=new Student("Vamsi",38);
		Student s6=new Student("Ramesh",40);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		Collections.sort(list,new AgeComparator());
		for(Student student:list)
		{
			System.out.println(student.getName());
			System.out.println(student.getAge());

		}
	}

}
