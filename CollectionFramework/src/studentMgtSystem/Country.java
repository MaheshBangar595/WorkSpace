package studentMgtSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {

	public List<List<String>> addCountry() {

		List<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("pune");
		Maharashtra.add("Mumbai");
		Maharashtra.add("Nashik");

		List<String> Gujrat = new ArrayList<String>();
		Gujrat.add("Surat");
		Gujrat.add("Gandhinagar");
		Gujrat.add("Vapi");

		List<List<String>> India = new ArrayList<List<String>>();
		India.add(Maharashtra);
		India.add(Gujrat);

		return India;

	}

	public static void main(String[] args) {

		Country country = new Country();
		List<List<String>> India = country.addCountry();

		System.out.println("--------For Each--------");
		for (List<String> state : India) {
			//System.out.println(state);
			for (String cities : state) {
				System.out.println(cities);
			}
		}

		System.out.println("-------Using Iterator------");

		Iterator<List<String>> itr = India.iterator();
		while (itr.hasNext()) {
			
			List<String> state = itr.next();
			
			Iterator<String> itr2 = state.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}

	}

}
