package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class World {
	public Map<String, Map<String, Map<String, String>>> addCountry() {

		Map<String, String> Maharashtra = new HashMap<String, String>();
		// Map<String, String> Maharashtra =new LinkedHashMap<String, String>();
		Maharashtra.put("MH16", "Ahmednagar");
		Maharashtra.put("MH12", "Pune");
		Maharashtra.put("MH15", "Nashik");

		Map<String, String> Gujrat = new HashMap<String, String>();
//		Map<String, String> Gujrat = new LinkedHashMap<String, String>();
		Gujrat.put("GJ01", "Ahmedabad");
		Gujrat.put("GJ05", "Surat");
		Gujrat.put("GJ18", "Gandhinagar");

		Map<String, Map<String, String>> India = new HashMap<String, Map<String, String>>();
		// Map<String,Map<String, String>> India = new LinkedHashMap<String,Map<String,
		India.put("MAHARASHTRA", Maharashtra);
		India.put("GUJRAT", Gujrat);

		Map<String, String> NewYork = new HashMap<String, String>();
		// Map<String, String> NewYork = new LinkedHashSet<String>();
		NewYork.put("NEW YORK1", "New York 1");
		NewYork.put("NEW YORK2", "New York 2");
		NewYork.put("NEW YORK3", "New York 3");

		Map<String, String> NewJersey = new HashMap<String, String>();
		// Set<String> NewJersey = new LinkedHashSet<String>();
		NewJersey.put("NEW JERSEY1", "New Jersey 1");
		NewJersey.put("NEW JERSEY2", "New Jersey 2");
		NewJersey.put("NEW JERSEY3", "New Jersey 3");

		Map<String, Map<String, String>> USA = new HashMap<String, Map<String, String>>();
		// Set<Set<String>>USA = new LinkedHashSet<Set<String>>();
		USA.put("NY", NewYork);
		USA.put("NJ", NewJersey);

		Map<String, Map<String, Map<String, String>>> world = new HashMap<String, Map<String, Map<String, String>>>();
		world.put("INDIA", India);
		world.put("US", USA);

		return world;

	}

	public static void main(String[] args) {
		World world = new World();
		Map<String, Map<String, Map<String, String>>> World = world.addCountry();

		System.out.println("-----------For Each----------");

		Set<String> country = World.keySet();
		for (String Country : country) {
			System.out.println(Country);

			Map<String, Map<String, String>> State = World.get(Country);
			Set<String> state = State.keySet();
			for (String city : state) {
				System.out.println(city);

				Map<String, String> cities = State.get(city);
				Set<String> City = cities.keySet();
				for (String Village : City) {
					System.out.println(Village + " " + cities.get(Village));
				}

			}

		}

		System.out.println("-------------Using Iterator-------------");

		Set<String> country1 = World.keySet();
		Iterator<String> Country = country1.iterator();
		while (Country.hasNext()) {
			String Country1 = Country.next();
			System.out.println(Country1);
			Map<String, Map<String, String>> state = World.get(Country1);
			Set<String> states = state.keySet();
			Iterator<String> State = states.iterator();
			while (State.hasNext()) {
				String city = State.next();
				System.out.println(city);
				Map<String, String> cities = state.get(city);
				Set<String> City = cities.keySet();
				Iterator<String> village = City.iterator();
				while (village.hasNext()) {
					String Village = village.next();
					System.out.println(Village + " " + cities.get(Village));
				}

			}

		}

	}

}
