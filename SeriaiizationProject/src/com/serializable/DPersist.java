package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.Employee;

public class DPersist {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
		
		Employee e = (Employee) in.readObject();
		Employee e1 = (Employee) in.readObject();
		System.out.println(e.eid+" "+e.name+" "+e.address+" "+e.address);
		System.out.println(e1.eid + " " + e1.name + " " + e1.address + " " + e1.address);
		
		//in.close();
	
}
}