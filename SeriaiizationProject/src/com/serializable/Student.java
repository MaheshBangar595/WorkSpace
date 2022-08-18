package com.serializable;

import java.io.Serializable;

public class Student implements Serializable {

	public int id;
	public String name;
	public Address address;

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}
