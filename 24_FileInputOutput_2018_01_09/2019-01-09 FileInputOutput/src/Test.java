import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import randomLib.RandomLibraryException;

public class Test {

	private static final int NUM_PERSON = 10000;

	public static void main(String[] args) throws IOException, RandomLibraryException {
		/*BufferedReader br = new BufferedReader(new FileReader("poem.txt"));
		
		String line = null;
		while(true) {
			line = br.readLine();
			if (line == null) break;
			System.out.println(line);
			
		}

		br = new BufferedReader(new FileReader("src/Person.java"));
		
		line = null;
		while((line = br.readLine()) != null) {
			//System.out.println(Person.getPerson(line, ";"));	
			System.out.println(line);
		}
		
		br.close();
*/
/*		
		ArrayList<Person> alp = new ArrayList<>();
		alp.add(new Person("Pasha",34,98.3, true));
		alp.add(new Person("Glasha",24,68.3, true));
		alp.add(new Person("Misha",10,42.3, false));
		alp.add(new Person("Sarah",18,48.3, true));
		
		File file = new File("writtenPersons.txt");
		if(!file.exists())file.createNewFile();
		
		PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		for (Person p : alp) pw.println(p.toCSV());
		//pw.println(new Person("Mahmud", 32, 85.6, false).toCSV());
		pw.close();
*/		
		File file = new File("writtenPersons.txt");
		if(!file.exists())file.createNewFile();
		
		PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		long t1 = System.currentTimeMillis();
		for (int i=0; i<NUM_PERSON; i++) pw.println(Person.getRandomPerson().toCSV());
		long t2 = System.currentTimeMillis();
		System.out.println((t2-t1)+"ms");
		pw.close();
	}

}
