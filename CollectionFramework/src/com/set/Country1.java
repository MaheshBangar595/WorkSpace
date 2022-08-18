package com.set;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Country1 {

	
		public Set<String> addCountry() {

			Set<String> maharashtra = new TreeSet<String>();
			maharashtra.add("pune");
			maharashtra.add("Mumbai");
			maharashtra.add("Nashik");

			

			return maharashtra;

		}

		public static void main(String[] args) {

			Country1 country = new Country1();
			Set<String> maharashtra = country.addCountry();
for(String s:maharashtra) {
	System.out.println(s);
}
		

	}
}

