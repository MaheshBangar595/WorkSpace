package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountryList {
	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		List<String> Gujrat = new ArrayList<String>();
		Gujrat.add("Surat");
		Gujrat.add("Gandhinagar");
		Gujrat.add("Vapi");

		Map<String, List<String>> India = new LinkedHashMap<String, List<String>>();
		// Map<String, List<String>> India = new HashMap<String, List<String>>();
		India.put("MAHARASHTRA", maharashtra);
		India.put("GUJRAT", Gujrat);

		return India;
	}

	public static void main(String[] args) {
		CountryList country = new CountryList();
		Map<String, List<String>> India = country.addCountry();

		System.out.println("-----------Using For Each------------");
		Set<String> stateName = India.keySet();
		// System.out.println(stateName);

		for (String key : stateName) {
			System.out.println(key);
			List<String> stateList = India.get(key);
			System.out.println(stateList);
			for (String cities : stateList) {
				System.out.println(cities);
			}

		}

		System.out.println("-------------Using Iterator Interface-----------------");
		Set<String> StateName = India.keySet();

		Iterator<String> itr = StateName.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			// System.out.println(s);
			System.out.println(s + " " + India.get(s));
			List<String> city = India.get(s);
			Iterator<String> cities = city.iterator();
			while (cities.hasNext()) {
				String s1 = cities.next();
				System.out.println(s1);

			}

		}

	}

}