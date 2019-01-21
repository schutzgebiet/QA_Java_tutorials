package appl;

import java.io.IOException;

import item.Person;
import model.PersonDB;
import randomLib.RandomLibraryException;

public class PersonApp {

	public static void main(String[] args) throws RandomLibraryException, IOException {

		PersonDB db = new PersonDB();
		db.fill(20);
		db.addPerson(new Person(333333333, "David", 23, 65.3, false));
		db.display();

		System.out.println("=====================================================");
		System.out.println(db.getByTeudatZeut(333333333));
		System.out.println("=====================================================");

		for (Person p : db.getByName("Pascha")) {
			System.out.println(p);
		}
		System.out.println("=====================================================");
		for (Person p : db.getAllByName()) {
			System.out.println(p);
		}

		System.out.println("=====================================================");
		for (Person p : db.getByAge(27)) {
			System.out.println(p);
		}

		System.out.println("=====================================================");
		for (Person p : db.getAllByAge()) {
			System.out.println(p);
		}

		System.out.println("=====================================================");
		for (Person p : db.getAgeInRange(30, 80)) {
			System.out.println(p);
		}
		
		System.out.println("8888888888888888888888888888888888888888888888888888");
		for (Person p : db.getByWeight(62.0)) {
			System.out.println(p);
		}
		
		System.out.println("8888888888888888888888888888888888888888888888888888");
		for (Person p : db.getAllByWeight()) {
			System.out.println(p);
		}
		
		System.out.println("8888888888888888888888888888888888888888888888888888");
		for (Person p : db.getWeightInRange(40., 80.)) {
			System.out.println(p);
		}
		
		System.out.println("8888888888888888888888888888888888888888888888888888");
		for (Person p : db.getMarried()) {
			System.out.println(p);
		}
		
		System.out.println("8888888888888888888888888888888888888888888888888888");
		for (Person p : db.getNotMarried()) {
			System.out.println(p);
		}
		
		System.out.println("#####################################################");
//		for(Person p : db.getCreatedTimeMap().keySet()) {
//			System.out.println(p);
//		}
		
		db.printPerson(db.getCreatedTimeMap().values());
		

	}

}
