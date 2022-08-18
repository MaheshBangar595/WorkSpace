package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(104);
		set.add(103);
		set.add(null);
		set.add(null);

		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Mahesh");
		set1.add("Dipak");
		set1.add("Kiran");
		

		System.out.println("-------------Iterator Interface-----------");

		Iterator<String> itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------For Each---------");
		for (String i : set1) {
			System.out.println(i);
		}

		System.out.println("-------------LinkedHashSet--------------");
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("abc");
		set2.add("xyz");
		set2.add("pqr");
		set2.add("abc");
		set2.add("xyz");
		set2.add("pqr");
		set2.add("acd");
		set2.add(null);
		set2.add(null);
		System.out.println(set2);

		System.out.println("------------TreeSet-----------");
		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(303);
		set3.add(11);
		set3.add(404);
		set3.add(55);
		set3.add(303);
		set3.add(11);
		// set3.add(null);
		System.out.println(set3);

		Set<String> set4 = new TreeSet<String>();
		set4.add("Mahesh");
		set4.add("Hrushi");
		set4.add("Dipak");
		set4.add("Mahesh");
		set4.add("Kiran");
		set4.add("Dipak");

		System.out.println(set4);
		
		for(String s:set4) {
			System.out.println(s);
		}

	}

}
