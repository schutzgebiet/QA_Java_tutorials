package appl;

import java.util.Comparator;
import java.util.TreeSet;

import item.Person;

import randomLib.RandomLibraryException;

public class RandomPersonApp {

	private static final int NUM_NUM = 10;

	public static void main(String[] args) {
		
		Comparator<Person> byName = (p1,p2)->p1.getName().compareTo(p2.getName());
		Comparator<Person> byAge = (p1,p2)->p1.getAge()-(p2.getAge());
		Comparator<Person> byWeight = (p1,p2)->((Double)(p1.getWeight())).compareTo((Double)p2.getWeight());
		
		Comparator<Person> byNameAge = (p1,p2)->{
			int res1 = p1.getName().compareTo(p2.getName());
			return res1 != 0 ? res1: p1.getAge() - p2.getAge();
		};
		
		TreeSet<Person> tsp = new TreeSet<>(byAge);
		for(int i = 0;i<NUM_NUM;i++)tsp.add(Person.getRandomPerson());
		
		for(Person p:tsp) {
			System.out.println(p);
		}
		System.out.println("============================");
		
		Person fromPerson = new Person();
		fromPerson.setAge(30);
		Person toPerson = new Person();
		toPerson.setAge(80);
		
		for(Person p:tsp.subSet(fromPerson, toPerson)) {
			System.out.println(p);
		}
	}
}
