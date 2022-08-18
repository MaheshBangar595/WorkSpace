package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DPersistAggreation {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output1.txt"));
		
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.address.ladr + " " + s.address.padr);
		in.close();
	}

}
