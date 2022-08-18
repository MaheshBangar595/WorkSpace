package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class World {

	public Set<Set<Set<String>>> addCountry() {
		//Set<String> maharashtra = new HashSet<String>();
		 Set<String> maharashtra = new LinkedHashSet<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		//Set<String> Gujrat = new HashSet<String>();
		 Set<String> Gujrat = new LinkedHashSet<String>();
		Gujrat.add("Surat");
		Gujrat.add("Gandhinagar");
		Gujrat.add("Vapi");

		//Set<Set<String>> India = new HashSet<Set<String>>();
		 Set<Set<String>> India = new LinkedHashSet<Set<String>>();
		India.add(maharashtra);
		India.add(Gujrat);

		//Set<String> NewYork = new HashSet<String>();
		 Set<String> NewYork = new LinkedHashSet<String>();
		NewYork.add("New York 1");
		NewYork.add("New York 2");
		NewYork.add("New York 3");

		//Set<String> NewJersey = new HashSet<String>();
		 Set<String> NewJersey = new LinkedHashSet<String>();
		NewJersey.add("New Jersey 1");
		NewJersey.add("New Jersey 2");
		NewJersey.add("New Jersey 3");

		//Set<Set<String>> USA = new HashSet<Set<String>>();
		 Set<Set<String>>USA = new LinkedHashSet<Set<String>>();
		USA.add(NewYork);
		USA.add(NewJersey);

		Set<Set<Set<String>>> world = new HashSet<Set<Set<String>>>();
		world.add(India);
		world.add(USA);

		return world;

	}

	public static void main(String[] args) {
		World world = new World();
		Set<Set<Set<String>>> World = world.addCountry();

		System.out.println("-------For Each-------");
		for (Set<Set<String>> country : World) {
			// System.out.println(World);
			for (Set<String> state : country) {
				// System.out.println(state);
				for (String cities : state) {
					System.out.println(cities);
				}
			}
		}

		System.out.println("---------Using Iterator-------");
		Iterator<Set<Set<String>>> itr = World.iterator();
		while (itr.hasNext()) {
			Set<Set<String>> country = itr.next();
			Iterator<Set<String>> itr1 = country.iterator();
			while (itr1.hasNext()) {
				Set<String> state = itr1.next();
				Iterator<String> itr2 = state.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());

				}
			}

		}
	}
}
