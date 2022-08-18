package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.model.Employee;

public class Persist {

	public static void main(String[] args) throws IOException {

		Employee e = new Employee(101, "Vivek", "Pune");
		Employee e1 = new Employee(102, "Pratik", "PCMC");

		FileOutputStream fout = new FileOutputStream("Output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e);
		out.writeObject(e1);
		out.close();
		System.out.println("Serialization Success!!!!!!");

	}

}
