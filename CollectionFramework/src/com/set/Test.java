package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee(101, "Amol");
		Employee e1 = new Employee(101, "Amol");

		Set<Employee> setOfEmployees = new HashSet<Employee>();

		setOfEmployees.add(e);
		setOfEmployees.add(e1);

		System.out.println(setOfEmployees.size());
	}

}
