package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		System.out.println(al);
		System.out.println("-----Using iterator interface-----");

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}
		System.out.println("-------For Each-------");
		for (Integer i : al) {
			System.out.println(i);
		}
	}

}
