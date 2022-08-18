package com.failsafeandfailfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(109);
		al.add(111);
		al.add(102);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
			// al.add(188);
			// copyOnWriteArrayList<E>
			// copyOnWriteArraySet<E>
			// copyOnWriteHashMap<K,V>

			CopyOnWriteArrayList<Integer> al1 = new CopyOnWriteArrayList<Integer>();
			al1.add(101);
			al1.add(109);
			al1.add(111);
			al1.add(102);

			Iterator<Integer> itr1 = al.iterator();
			while (itr1.hasNext()) {
				//al1.add(111);
				System.out.println(itr1.next());
			}
			System.out.println(al1);
		}
}