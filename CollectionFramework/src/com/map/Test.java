package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>(); // 0-15
		map.put(101, "Rahul");
		map.put(102, "Kiran");
		map.put(105, "Mahesh");
		map.put(107, "Dipak");
		// map.put(null, "Hrushi"); //null called
		System.out.println("---------HashMap-------");

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(107));
		System.out.println(map.isEmpty());

		// keySet(), EnterySet(), Values()

		System.out.println("---------Using Iterator Interface--------");

		Set<Integer> setOfKeys = map.keySet();// list of keys set format
		System.out.println(setOfKeys);

		Iterator<Integer> itr = setOfKeys.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " " + map.get(key));
			// System.out.println(itr.next());
		}
		System.out.println("---------For Each-------");
		Set<Integer> setOfKey = map.keySet();
		System.out.println(setOfKey);
		for (Integer key : setOfKeys) {
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("-------LinkedHashMap--------");
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		map2.put("abc", 105);
		map2.put("pqr", 107);
		map2.put("xyz", 106);
		map2.put("mno", 102);

		System.out.println(map2);

		System.out.println("----------Using Iterator Interface-------");
		Set<String> setOfkeys = map2.keySet();
		System.out.println(setOfkeys);

		Iterator<String> itr1 = setOfkeys.iterator();
		while (itr1.hasNext()) {
			String keys = itr1.next();
			System.out.println(keys + " " + map2.get(keys));
		}

		System.out.println("--------For Each-------------");
		Set<String> setOfkey = map2.keySet();
		System.out.println(setOfkey);
		for (String s : setOfkey) {
			System.out.println(s + " " + map2.get(s));
		}

		System.out.println("----------TreeMap----------");
		Map<String, Integer> map3 = new TreeMap<String, Integer>();
		map3.put("abc", 105);
		map3.put("pqr", 107);
		map3.put("xyz", 106);
		map3.put("mno", 102);

		System.out.println(map3);

		System.out.println("-----------Using Iterator Interface-------");
		Set<String> keys = map3.keySet();
		System.out.println(keys);

		Iterator<String> itr2 = keys.iterator();
		while (itr2.hasNext()) {
			String s = itr2.next();
			System.out.println(s + " " + map3.get(s));
		}

		System.out.println("--------For Each---------");
		Set<String> key = map3.keySet();
		System.out.println(key);
		for (String s : key) {
			System.out.println(s + " " + map3.get(s));
		}

	}

}
