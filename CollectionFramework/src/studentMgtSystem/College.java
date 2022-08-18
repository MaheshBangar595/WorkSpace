package studentMgtSystem;

import java.util.ArrayList;
import java.util.List;

public class College {

	public List<Student> addStudentDetails() {

		Student s = new Student();
		s.setId(101);
		s.setName("Mahesh");
		s.setAddress("Pune");

		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Hrushi");
		s1.setAddress("PCMC");

		List<Student> listofStudent = new ArrayList<Student>();
		listofStudent.add(s);
		listofStudent.add(s1);

		return listofStudent;
	}

}
