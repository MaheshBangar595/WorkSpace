package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World1 {
	public Map<String, Map<String, List<String>>> addWorld() {

		List<String> mh = new ArrayList<String>();
		mh.add("pune");
		mh.add("nashik");
		mh.add("mumbai");

		List<String> gj = new ArrayList<String>();
		gj.add("surat");
		gj.add("vapi");
		gj.add("gandhinagar");

		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("MH", mh);
		india.put("GJ", gj);

		List<String> USA1 = new ArrayList<String>();
		USA1.add("newyork1");
		USA1.add("newyork2");
		USA1.add("newyork3");

		List<String> USA2 = new ArrayList<String>();
		USA2.add("chicago1");
		USA2.add("chicago1");
		USA2.add("chicago1");

		Map<String, List<String>> USA = new HashMap<String, List<String>>();
		USA.put("AMERICA1", USA1);
		USA.put("AMERICA2", USA2);

		Map<String, Map<String, List<String>>> world = new HashMap<String, Map<String, List<String>>>();
		world.put("COUNTRY1", india);
		world.put("COUNTRY2", USA);

		return world;

	}

	public static void main(String[] args) {

		World1 w = new World1();
		Map<String, Map<String, List<String>>> world = w.addWorld();

		Set<String> first = world.keySet();
		System.out.println(first);
		for (String countrySearch : first) {
			System.out.println(countrySearch);

			Map<String, List<String>> second = world.get(countrySearch);
			Set<String> search2 = second.keySet();
			for (String statesearch : search2) {
				System.out.println(statesearch);

				List<String> third = second.get(statesearch);
				for (String string : third) {
					System.out.println(string);

				}
			}
			System.out.println("------------------------------------------");
		}

		System.out.println("---------------");

	}

}
