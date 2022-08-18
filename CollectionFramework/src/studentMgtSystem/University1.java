package studentMgtSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University1 {
	public List<List<List<String>>> addField() {

		List<String> Field = new ArrayList<String>();
		Field.add("Mechanical");
		Field.add("Electrical");
		Field.add("Civil");
		Field.add("Computer");

		List<String> Subject = new ArrayList<String>();
		Subject.add("Physics");
		Subject.add("Mechanics");
		Subject.add("Math");
		Subject.add("ThermoDynamics");

		List<String> BranchCode = new ArrayList<String>();
		BranchCode.add("0101");
		BranchCode.add("0102");
		BranchCode.add("0103");
		BranchCode.add("0104");

		List<List<String>> Engineering = new ArrayList<List<String>>();
		Engineering.add(Field);
		Engineering.add(Subject);
		Engineering.add(BranchCode);

		List<String> field = new ArrayList<String>();
		field.add("BSC Agri");
		field.add("BSC Nursing");
		field.add("BSC Computer Science");
		field.add("BSC Physics");

		List<String> subject = new ArrayList<String>();
		subject.add("Physics");
		subject.add("Math");
		subject.add("Chemistry");

		List<List<String>> BSC = new ArrayList<List<String>>();
		BSC.add(field);
		BSC.add(subject);

		List<List<List<String>>> University1 = new ArrayList<List<List<String>>>();
		University1.add(Engineering);
		University1.add(BSC);

		return University1;
	}

	public static void main(String[] args) {

		University1 university = new University1();
		List<List<List<String>>> University1 = university.addField();

		System.out.println("---------For Each-------");
		for (List<List<String>> University : University1) {
			for (List<String> field : University) {
				for (String field2 : field) {
					System.out.println(field2);
				}
			}

		}

		System.out.println("---------Using Iterate--------");
		//List<List<List<String>>> University1 = university.addField();
		Iterator<List<List<String>>> itr = University1.iterator();
		while (itr.hasNext()) {
			List<List<String>> University = itr.next();
			Iterator<List<String>> itr1 = University.iterator();
			while (itr1.hasNext()) {
				List<String> field = itr1.next();
				Iterator<String> itr2 = field.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());
				}
			}
		}

	}

}
