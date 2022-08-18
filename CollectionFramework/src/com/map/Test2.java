package com.map;

import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		
		World world = new World();
		Map<String, Map<String, Map<String, String>>> world1= world.addCountry();
		System.out.println(world1);
	}

}
