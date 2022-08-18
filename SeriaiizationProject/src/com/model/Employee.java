package com.model;

import java.io.Serializable;

public class Employee implements Serializable {

	public transient int eid;
	public String name;
	public transient String address;

	public Employee(int eid, String name, String address) {

		this.eid = eid;
		this.name = name;
		this.address = address;

	}

}
