package studentMgtSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
	public List<List<List<String>>> addCountry() {

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

		List<String> NewYork = new ArrayList<String>();
		NewYork.add("New York 1");
		NewYork.add("New York 2");
		NewYork.add("New York 3");

		List<String> NewJersey = new ArrayList<String>();
		NewJersey.add("New Jersey 1");
		NewJersey.add("New Jersey 2");
		NewJersey.add("New Jersey 3");

		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(NewYork);
		USA.add(NewJersey);

		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(India);
		world.add(USA);

		return world;

	}

	public static void main(String[] args) {
		World world = new World();
		List<List<List<String>>> World = world.addCountry();

		System.out.println("-------For Each-------");
		for (List<List<String>> country : World) {
			// System.out.println(World);
			for (List<String> state : country) {
				// System.out.println(state);
				for (String cities : state) {
					System.out.println(cities);
				}
			}
		}

		System.out.println("---------Using Iterator-------");
		Iterator<List<List<String>>> itr = World.iterator();
		while (itr.hasNext()) {
			List<List<String>> country = itr.next();
			Iterator<List<String>> itr1 = country.iterator();
			while (itr1.hasNext()) {
				List<String> state = itr1.next();
				Iterator<String> itr2 = state.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());

				}
			}

		}
	}
}