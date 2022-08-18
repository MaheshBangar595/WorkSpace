package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountryTree {

	public Set<Set<String>> addCountry() {

		Set<String> maharashtra = new TreeSet<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		Set<String> Gujrat = new TreeSet<String>();
		Gujrat.add("Surat");
		Gujrat.add("Gandhinagar");
		Gujrat.add("Vapi");

		Set<Set<String>> India = new TreeSet<Set<String>>();
		India.add(maharashtra);
		India.add(Gujrat);
		
		return India;
	}

	public static void main(String[] args) {

		CountryTree country = new CountryTree();
		Set<Set<String>> India = country.addCountry();
		System.out.println(India);
//
//		System.out.println("--------For Each--------");
//		for (Set<String> state : India) {
//			// System.out.println(state);
//			for (String cities : state) {
//				System.out.println(cities);
//			}
//		}

		/*
		 * System.out.println("-------Using Iterator------");
		 * 
		 * Iterator<Set<String>> itr = India.iterator(); while (itr.hasNext()) {
		 * 
		 * Set<String> state = itr.next();
		 * 
		 * Iterator<String> itr2 = state.iterator(); while (itr2.hasNext()) {
		 * System.out.println(itr2.next()); }
		 * 
		 * }
		 */

	}

}
