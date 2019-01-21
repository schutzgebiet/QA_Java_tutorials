import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import dto.Person;

public class Test {

	private static final int NUM_PERSON = 10000;

	public static void main(String[] args) {
		
		TreeSet<Person> tsp = new TreeSet<>((p1,p2)->p1.getAge() - p2.getAge());
		for (int i=0; i<NUM_PERSON; i++) tsp.add(Person.getRandomPerson());
		
		TreeMap<Integer, Integer> tmii = new TreeMap<>();
		for (Person p : tsp) {
			int key = p.getAge()/10;
			if (tmii.get(key) == null) tmii.put(key, 1);
			else tmii.put(key, tmii.get(key) +1);
		}
		
		for (Entry<Integer, Integer> e : tmii.entrySet()) {
			int low = e.getKey()*10;
			int high = low+10;
			System.out.println(low+"-"+high+" : "+e.getValue());
		}
			
	}

}
