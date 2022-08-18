package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class CInheritance {

	public static void main(String[] args) throws IOException {

		B b = new B(101, "Mahesh", "Pune");

		FileOutputStream fout = new FileOutputStream("Output.pdf");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b);
		out.close();
		System.out.println("Serialization Success!!!!!!");
	
	}
}
