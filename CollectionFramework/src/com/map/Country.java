package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Country {

	public Map<String, Map<String, String>> addCountry() {

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
		// String>>();
		India.put("MAHARASHTRA", Maharashtra);
		India.put("GUJRAT", Gujrat);

		return India;
	}

	public static void main(String[] args) {
		Country country = new Country();
		Map<String, Map<String, String>> India = country.addCountry();

		System.out.println("-----------For Each-----------");
		Set<String> state = India.keySet();
		// System.out.println(state);
		for (String cities : state) {
			// System.out.println(cities);//+" "+India.get(cities)
			System.out.println(cities);
			Map<String, String> states = India.get(cities);
			// System.out.println(st);
			Set<String> city = states.keySet();

			for (String string : city) {
				System.out.println(string + "  " + states.get(string));
			}

		}

		System.out.println("---------Using Iterator---------- ");

		Set<String> State = India.keySet();
		// System.out.println(state);
		Iterator<String> city = State.iterator();
		while (city.hasNext()) {
			String cities = city.next();
			// System.out.println(cities);
			System.out.println(cities/* +" "+India.get(cities) */);

			Map<String, String> States = India.get(cities);

			Set<String> town = States.keySet();
			Iterator<String> Town = town.iterator();
			while (Town.hasNext()) {
				String village = Town.next();
				System.out.println(village + " " + States.get(village));
			}

		}

	}

}
