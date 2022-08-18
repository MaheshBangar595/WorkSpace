package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Mahesh");
		map.put(102, "Dipak");
		map.put(103, "Kiran");

		System.out.println("----------Key Set--------");
		
		Set<Integer> set = map.keySet();
		for(Integer i:set) {
			System.out.println("key:"+i+" value:"+map.get(i));
		}
		
		System.out.println("---------EntrySet-----------");
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		
		for(Map.Entry<Integer, String> e:entries) {
			
			System.out.println("key:"+e.getKey()+" Value:"+e.getValue());
			
		}
		
		System.out.println("-----------ValueSet-----------------");
		
	}

}
