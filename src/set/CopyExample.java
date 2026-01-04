package set;

import java.util.HashSet;

public class CopyExample {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<>();
		Student s1=new Student(1,"Raju");
		Student s2=new Student(2,"Ramesh");
		studentSet.add(s1);
		studentSet.add(s2);
		for(Student student:studentSet)
		{
			System.out.println(student.getsId());
			System.out.println(student.getSname());
		}
		HashSet<Student> copySet= (HashSet<Student>)studentSet.clone();
		copySet.forEach(student->{
			if(student.getsId()==1) {
				student.setSname("vijay");
			}
		});
		System.out.println("--------------");

		for(Student student:studentSet)
		{
			System.out.println(student.getsId());
			System.out.println(student.getSname());
		}
		System.out.println("--------------");
		
		for(Student student:copySet)
		{
			System.out.println(student.getsId());
			System.out.println(student.getSname());
		}

	}

}
