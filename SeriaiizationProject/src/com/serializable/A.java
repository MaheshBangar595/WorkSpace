package com.serializable;
import java.io.Serializable;
public class A implements Serializable {

	public int id;
	public String name;
	public String address;
	
	public A(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
}
