package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import item.Person;

class SubSetTest {
	
	static TreeSet<Person> tsp = new TreeSet<Person>((p1,p2)-> p1.getAge()-p2.getAge());
	static TreeSet<Person> personSubset = new TreeSet<Person>((p1,p2)-> p1.getAge()-p2.getAge());
	static Person personMin = new Person();
	static Person personMax = new Person();
	static Person personAdd = new Person();
	static final int NUM_PERSON = 100;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		personMin.setAge(30);
		personMax.setAge(90);
		personAdd.setAge(160);
		for(int i = 0 ; i<NUM_PERSON;i++) {
			tsp.add(Person.getRandomPerson());
			personSubset = (TreeSet<Person>) tsp.subSet(personMin, personMax);
		}
		for(Person p: tsp.subSet(personMin, personMax)) personSubset.add(p);
	    //personSubset.add(personAdd);
		//making clone!!!
	}

	@Test
	void test() {
		boolean flag = true;
		for(Person p: tsp) {
			boolean inside = p.getAge() >= personMin.getAge() ||
					p.getAge() < personMax.getAge();
			if(!(inside == tsp.contains(p))) {
				flag = false;
				break;
			}
		}
		if(flag) {
			for(Person p : personSubset) {
				if(!(tsp.contains(p))) {
					flag = false;
					break;
				}
			}
			assertTrue(flag);
		}
	}

}
