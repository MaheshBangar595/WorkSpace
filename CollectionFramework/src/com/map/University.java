package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class University {

	public Map<String, Map<String, String>> addUniversity() {

		// Map<String, String> puneUniversity = new HashMap<String, String>();
		Map<String, String> puneUniversity = new LinkedHashMap<String, String>();
		puneUniversity.put("ENGG", "ENGINEERING");
		puneUniversity.put("BSC", "BSC Physics");
		puneUniversity.put("MSC", "Msc Chemistry");

		// Map<String, String> shivajiUniversity = new HashMap<String, String>();
		Map<String, String> shivajiUniversity = new LinkedHashMap<String, String>();

		shivajiUniversity.put("MEDICAL", "MBBS");
		shivajiUniversity.put("PHARMACY", "B. Pharmacy");
		shivajiUniversity.put("DIPLOMA", "Mechanical");

		Map<String, Map<String, String>> MaharashtraUniversity = new HashMap<String, Map<String, String>>();
		MaharashtraUniversity.put("PUNEUNI", puneUniversity);
		MaharashtraUniversity.put("SHIVAJIUNI", shivajiUniversity);

		return MaharashtraUniversity;
	}

	public static void main(String[] args) {
		University uni = new University();
		Map<String, Map<String, String>> MAHUNI = uni.addUniversity();
		System.out.println("------------For Each-----------");
		Set<String> uniName = MAHUNI.keySet();
		for (String uni1 : uniName) {
			System.out.println(uni1);

			Map<String, String> unilist = MAHUNI.get(uni1);
			// System.out.println(unilist);
			Set<String> uni2 = unilist.keySet();
			for (String mhuni : uni2) {
				System.out.println(mhuni + " " + unilist.get(mhuni));
			}
		}
		System.out.println("----Using Iterator Interface----");

		Set<String> Uni = MAHUNI.keySet();
		// System.out.println(Uni);
		Iterator<String> university = Uni.iterator();
		while (university.hasNext()) {
			String mahuni = university.next();
			System.out.println(mahuni);

			Map<String, String> stream = MAHUNI.get(mahuni);
			Set<String> field = stream.keySet();
			Iterator<String> Field = field.iterator();
			while (Field.hasNext()) {
				String branch = Field.next();
				System.out.println(branch + " " + stream.get(branch));
			}

		}
	}
}
