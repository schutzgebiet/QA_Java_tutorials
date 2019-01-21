import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import item.Person;

public class App {

	private static final String EXIT_CODE = "quit";
	private static final String CLEAR_CODE = "clear";

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> alp = new ArrayList<>();

		while (true) {

			String name = null;
			int age = 0;
			double weight = 0.;
			boolean married = false;

			String line = null;

			boolean exitFlag = false;
			boolean clearFlag = false;
			while (true) {
				System.out.println("input name");
				line = br.readLine();
				if (line == "")
					continue;
				if (line.equalsIgnoreCase(EXIT_CODE)) {
					exitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_CODE)) {
					clearFlag = true;
					break;
				}
				name = line;
				break;
			}
			if (exitFlag)
				break;
			if (clearFlag)
				continue;

			while (true) {
				System.out.println("input age(pos Integer)");
				line = br.readLine();
				if (line == "")
					continue;
				if (line.equalsIgnoreCase(EXIT_CODE)) {
					exitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_CODE)) {
					clearFlag = true;
					break;
				}
				try {
					age = Integer.parseInt(line);
					if (age < 1)
						continue;
				} catch (NumberFormatException e) {
					continue;
				}
				break;
			}
			if (exitFlag)
				break;
			if (clearFlag)
				continue;

			while (true) {
				System.out.println("input weight(pos double)");
				line = br.readLine();
				if (line == "")
					continue;
				if (line.equalsIgnoreCase(EXIT_CODE)) {
					exitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_CODE)) {
					clearFlag = true;
					break;
				}
				try {
					weight = Double.parseDouble(line);
					if (weight <= 0.)
						continue;
				} catch (NumberFormatException e) {
					continue;
				}
				break;
			}
			if (exitFlag)
				break;
			if (clearFlag)
				continue;

			while (true) {
				System.out.println("input married(yes or no)");
				line = br.readLine();
				if (line == "")
					continue;
				if (line.equalsIgnoreCase(EXIT_CODE)) {
					exitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_CODE)) {
					clearFlag = true;
					break;
				}
				if (line.equalsIgnoreCase("y")) {
					married = true;
					break;
				}
				if (line.equalsIgnoreCase("n")) {
					married = false;
					break;
				}
			}
			if (exitFlag)
				break;
			if (clearFlag)
				continue;

			alp.add(new Person(name, age, weight, married));
		}

		for (Person p : alp) {
			System.out.println(p);
		}
		System.out.println("==========================================================");

	}

}
