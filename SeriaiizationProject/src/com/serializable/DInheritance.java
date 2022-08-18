package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DInheritance {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.pdf"));
		
		B b = (B) in.readObject();
		System.out.println(b.id + " " + b.name + " " + b.address);
		
		in.close();
	}
}
