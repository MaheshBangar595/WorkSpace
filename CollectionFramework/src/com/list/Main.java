package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(103);

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());

		System.out.println("------Using interator-------");

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------for Each-------");
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
