package com.list;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		List al = new ArrayList();// by default 10 upgrade 10-20-40-80-160
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(106);
		al.add(106);
		al.add(107);

		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));// 106
		al.remove(4);
		System.out.println(al);
		System.out.println(al.isEmpty());

		System.out.println("--------------------------");

		ArrayList al2 = new ArrayList();
		al2.add("Mahesh");
		al2.add("Dipak");
		al2.add("Kiran");
		al2.add("Hrushi");

		System.out.println(al2);

		List al3 = new ArrayList();
		al3.add(101);
		al3.add("Test");
		al3.add(10l);

		System.out.println(al3);
	}

}
