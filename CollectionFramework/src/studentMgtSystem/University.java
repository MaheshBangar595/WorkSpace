package studentMgtSystem;

import java.util.Iterator;
import java.util.List;

public class University {

	public static void main(String[] args) {
		College college = new College();
		List<Student> listofStudent = college.addStudentDetails();
		Iterator<Student> itr = listofStudent.iterator();
		while (itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAddress());
		}

		System.out.println("-------For Each loop-----");
		for (Student s : listofStudent) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress());
		}
	}
}
