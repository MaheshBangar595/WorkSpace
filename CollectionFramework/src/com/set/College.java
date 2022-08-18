package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import studentMgtSystem.Student;

public class College {

	public Set<Student> addStudentDetails() {

		Student s = new Student();
		s.setId(101);
		s.setName("Mahesh");
		s.setAddress("Pune");

		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Hrushi");
		s1.setAddress("PCMC");
		
		Student s2 = new Student();
		s2.setId(103);
		s2.setName("Raju");
		s2.setAddress(null);

		Set<Student> listofStudent = new HashSet<Student>();
		//Set<Student> listofStudent = new LinkedHashSet<Student>();
		//Set<Student> listofStudent = new TreeSet<Student>();

		listofStudent.add(s);
		listofStudent.add(s1);
		listofStudent.add(s2);

		return listofStudent;
	}
	
}
