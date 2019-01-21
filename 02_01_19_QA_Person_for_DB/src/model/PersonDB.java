package model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import fileread.FileIO;
import item.Person;
import randomLib.RandomLibraryException;

// 1.add created time
// 2.write database to file


public class PersonDB {
	
	private static final String DB_FILE_NAME = "OurDB_person.txt";
	
	HashMap<Integer, Person> tzMap = new HashMap<>();
	TreeMap<String, ArrayList<Person>> nameMap = new TreeMap<>();
	TreeMap<Integer, ArrayList<Person>> ageMap = new TreeMap<>();
	TreeMap<Double, ArrayList<Person>> weightMap = new TreeMap<>(); //Home Work;
	TreeMap<Integer,ArrayList<Person>> marriedMap = new TreeMap<>();//Home Work;
	TreeMap<Integer,ArrayList<Person>> notMarriedMap = new TreeMap<>();//Home Work;
	
	TreeMap<LocalDateTime, Person> createdTimeMap = new TreeMap<>((date1,date2)->date1.compareTo(date2));
	
//	TreeMap<LocalDateTime, Person> createdTimeMap = new TreeMap<>(new Comparator<LocalDateTime>() {
//
//		@Override
//		public int compare(LocalDateTime date1, LocalDateTime date2) {
//			
//			return date1.compareTo(date2);
//		}
//		
//	});
	
	
	
	//ArrayList<ArrayList<Person>> marriedArr = new ArrayList<>();
	
	
	
	
	public boolean addPerson(Person person) {
		int teudatZeut = person.getTeudatZeut();
		if (tzMap.get(teudatZeut) != null) {
			return false;
		}
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
		
		double weight = person.getWeight(); //Home Work;
		if (weightMap.get(weight) == null) {
			weightMap.put(weight, new ArrayList<Person>());
		}
		weightMap.get(weight).add(person);
		
		if(person.isMarried()==true) { //Home Work;
			if (marriedMap.get(person.getTeudatZeut()) == null) {
				marriedMap.put(person.getTeudatZeut(), new ArrayList<Person>());
			}
			marriedMap.get(person.getTeudatZeut()).add(person);
		}
		
		if(person.isMarried()==false) { //Home Work;
			if (notMarriedMap.get(person.getTeudatZeut()) == null) {
				notMarriedMap.put(person.getTeudatZeut(), new ArrayList<Person>());
			}
			notMarriedMap.get(person.getTeudatZeut()).add(person);
		}
		
		LocalDateTime createdTime = person.getCreatedTime();
		createdTimeMap.put(createdTime, person);
		
//		int mar = person.isMarried()? 1:0;
//		marriedArr.get(mar).add(person);
		
		return true;
	}

	public void fill(int num) throws RandomLibraryException {
		for (int i = 0; i < num; i++) {
			addPerson(Person.getRandomPerson());
		}
	}

	public Person getByTeudatZeut(int tz) {
		return tzMap.get(tz);
	}

	public void display() {
		for (Person p : tzMap.values()) {
			System.out.println(p);
		}
	}

	public List<Person> getByName(String name) {
		List<Person> res = nameMap.get(name);
		return res == null ? new ArrayList<>() : res;
	}

	public List<Person> getByAge(int age) {
		List<Person> res = ageMap.get(age);
		return res == null ? new ArrayList<>() : res;
	}
	
	public List<Person> getByWeight(double weight) { //Home Work;
		List<Person> res = weightMap.get(weight);
		return res == null ? new ArrayList<>() : res;
	}

	public List<Person> getAllByAge() {
		ArrayList<Person> res = new ArrayList<>();
		for (Entry<Integer, ArrayList<Person>> e : ageMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}
	
	public List<Person> getAllByWeight() {  //Home Work;
		ArrayList<Person> res = new ArrayList<>();
		for (Entry<Double, ArrayList<Person>> e : weightMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}

	public List<Person> getAllByName() {
		ArrayList<Person> res = new ArrayList<>();
		for (Entry<String, ArrayList<Person>> e : nameMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}

	public List<Person> getAgeInRange(int ageMin, int ageMax) {
		ArrayList<Person> res = new ArrayList<>();
		Map<Integer, ArrayList<Person>> sub = ageMap.subMap(ageMin, true, ageMax, true);
		for (Entry<Integer, ArrayList<Person>> e : sub.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}
	
	public List<Person> getWeightInRange(double weightMin, double weightMax) { //Home Work;
		ArrayList<Person> res = new ArrayList<>();
		Map<Double, ArrayList<Person>> sub = weightMap.subMap(weightMin, true, weightMax, true);
		for (Entry<Double, ArrayList<Person>> e : sub.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}
	
	public List<Person> getMarried(){ //Home Work;
		ArrayList<Person> res = new ArrayList<>();
		for (Entry<Integer, ArrayList<Person>> e : marriedMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}
	
	public List<Person> getNotMarried(){ //Home Work;
		ArrayList<Person> res = new ArrayList<>();
		for (Entry<Integer, ArrayList<Person>> e : notMarriedMap.entrySet()) {
			res.addAll(e.getValue());
		}
		return res;
	}

	public TreeMap<LocalDateTime, Person> getCreatedTimeMap() {
		return createdTimeMap;
	}
	
	public void printPerson(Collection<Person> alp) throws IOException {
		FileIO fileIO = new FileIO(DB_FILE_NAME);
		fileIO.clean();
		fileIO.putDataInFile(Person.HEAD_FOR_CSV);
		for(Person p:alp) {
			fileIO.putDataInFile("\n" + p.toCSV());
		}	
	}

	public static void putPersonDataInFile(List<Person> sp, String nameFile) throws IOException {
		File file = new File(nameFile);
		if (!file.exists())
			file.createNewFile();

		String head = "name;age;weight;married;date";
		PrintWriter pw = new PrintWriter(file); //add with true, to save file, or false to receive !
		pw.println(head);

		for (Person p : sp) {
			pw.println(p.toCSV());
		}
		pw.close();
	}
	
	
	
//	public List<Person> getMarriedSecond(){
//		return marriedArr.get(1);
//	}
	
}
