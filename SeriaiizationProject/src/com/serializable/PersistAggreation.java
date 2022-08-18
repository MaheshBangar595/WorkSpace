package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistAggreation {

	public static void main(String[] args) throws IOException {

		Address address = new Address("Pune", "Mumbai");
		Student s = new Student(101, "Rahul", address);

		FileOutputStream fout = new FileOutputStream("Output1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		// out.writeObject(e1);
		out.close();
		System.out.println("Serialization Success!!!!!!!!");
	}

}