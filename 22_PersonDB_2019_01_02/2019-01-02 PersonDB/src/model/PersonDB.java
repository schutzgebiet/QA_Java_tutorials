package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import dto.Person;
import randomLib.RandomLibraryException;

public class PersonDB {
	HashMap<Integer, Person> tzMap = new HashMap<>();
	TreeMap<String, ArrayList<Person>> nameMap = new TreeMap<>();
	TreeMap<Integer, ArrayList<Person>> ageMap = new TreeMap<>();
	
	public boolean addPerson(Person person) {
		int teudatZeut = person.getTeudatZeut();
		if (tzMap.get(teudatZeut) != null) return false;
		tzMap.put(teudatZeut, person);
		
		String name = person.getName();
		if (nameMap.get(name) == null) {
			nameMap.put(name, new ArrayList<Person>());
		}
		nameMap.get(name).add(person);
		
		int age = person.getAge();
		if (ageMap.get(age) == null) {
			ageMap.put(age, new ArrayList<Person>());
		}
		ageMap.get(age).add(person);
		
		return true;
	}
	
	public void fill(int num) throws RandomLibraryException {
		for (int i=0; i<num; i++) addPerson(Person.getRandomPerson());
	}
	
	public Person getByTeudatZeut(int tz) {
		return tzMap.get(tz);
	}
	
	public void display() {
		for(Person p : tzMap.values()) System.out.println(p);
	}
	
	public List<Person> getByName(String name){
		List<Person> res = nameMap.get(name);
		return res == null ? new ArrayList<>() : res;
	}
	
	public List<Person> getAllSortedByName(){
		ArrayList<Person> res = new ArrayList<>();
		for(Entry<String,ArrayList<Person>> e : nameMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;		
	}
	
	public List<Person> getByAge(int age){
		List<Person> res = ageMap.get(age);
		return res == null ? new ArrayList<>() : res;
	}
	
	public List<Person> getAllSortedByAge(){
		ArrayList<Person> res = new ArrayList<>();
		for(Entry<Integer,ArrayList<Person>> e : ageMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;		
	}
	
	public List<Person> getAgeInRange(int ageMin, int ageMax){
		ArrayList<Person> res = new ArrayList<>();
		Map<Integer, ArrayList<Person>> sub = 
				ageMap.subMap(ageMin, true, ageMax, true);
		for(Entry<Integer, ArrayList<Person>> e : sub.entrySet()) {
			res.addAll(e.getValue());
		}
		
		return res;
	}
}
