package com.collectionsclasstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		//Collections - java class
		//Collection<E>  - Interface
		
		List<Integer>al = new ArrayList<Integer>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(4);
		
		System.out.println("before sorting:"+al);
		Collections.sort(al);
		System.out.println("after sorting:"+al);
		
		System.out.println("-----------------------");
		List<String>al2= new ArrayList<String>();
		Collections.addAll(al2, "abc","xyz","pqr");
		System.out.println(al2);
		
		System.out.println("-----------------------");
		List<String>al3 = Collections.unmodifiableList(al2);
		//al3.add("mmm");
	   System.out.println("-------------------------");
	   Collections.synchronizedList(al2);
	}
	
}
