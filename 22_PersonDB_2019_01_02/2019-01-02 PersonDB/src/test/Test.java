package test;

import dto.Person;
import model.PersonDB;
import randomLib.RandomLibraryException;

public class Test {
	
	public static void main(String[] args) throws RandomLibraryException {
		PersonDB db = new PersonDB();
		db.fill(20);
		db.addPerson(new Person(333333333, "David", 23, 65.3, false));
		//db.display();
		System.out.println("************************");
		//System.out.println(db.getByTeudatZeut(333333333));
		//for(Person p : db.getAllSortedByName()) System.out.println(p);
		//for(Person p : db.getAllSortedByAge()) System.out.println(p);
		//for(Person p : db.getByAge(60)) System.out.println(p);
		for(Person p : db.getAgeInRange(30, 90))System.out.println(p);
	}

}
