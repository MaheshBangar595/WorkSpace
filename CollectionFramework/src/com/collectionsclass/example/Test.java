package com.collectionsclass.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer>al = new ArrayList<Integer>();
		al.add(66);
		al.add(11);
		al.add(99);
		al.add(88);
		al.add(55);
		System.out.println("before sorting:"+al);
		
		Collections.sort(al);
		System.out.println("after sorting:"+al);		
		
		
		System.out.println("-------unmodified list--------");
		
		List<Integer>al2 = new ArrayList<Integer>();
		al2.add(66);
		al2.add(11);
		al2.add(99);
		al2.add(88);
		al2.add(55);
		
		al.addAll(al2);
		System.out.println(al);
		
		List<Integer>al3 = Collections.unmodifiableList(al2); 
		//Collections.unmodifiableSet(s)
       // Collections.:unmodifiableMap(m)
		
		Collections.synchronizedList(al2);
		System.out.println(Collections.min(al2));
		System.out.println(Collections.max(al2));
		
		List<String>al4 = new ArrayList<String>();
		Collections.addAll(al, 2,5,7,8,9);
		System.out.println(al);
	
	}
	
}
