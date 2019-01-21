package item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person {

	private static final String[] NAMES_ARRAY = { "Sascha", "Mascha", "Dascha", "Pascha", "Glascha", "Arcascha",
			"Mischa", "Moischa", "Natascha", "Abrascha" };
	
	public static final String HEAD_FOR_CSV = "tz;name:age;weight;married;createdTime";
	
	private DateTimeFormatter toStringPattern =
			DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss",new Locale("ru"));
	
	private static final int MIN_AGE = 1;

	private static final int MAX_AGE = 120;

	private static final double MIN_WEIGHT = 10.;

	private static final double MAX_WEIGHT = 140.;

	private static final int MIN_MARRIED_AGE = 18;

	private static RandomExt gen = new RandomExt();

	private int teudatZeut;
	private String name;
	private int age;
	private double weight;
	private boolean married;
	private LocalDateTime createdTime;

	public Person() {
	}

	public Person(int teudatZeut, String name, int age, double weight, boolean married) {
		this.teudatZeut = teudatZeut;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
		this.createdTime = LocalDateTime.now();
	}

	public int getTeudatZeut() {
		return teudatZeut;
	}

	public void setTeudatZeut(int teudatZeut) {
		this.teudatZeut = teudatZeut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (married ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + teudatZeut;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.getAge())
			return false;
		if (married != other.isMarried())
			return false;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		if (teudatZeut != other.getTeudatZeut())
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.getWeight()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TZ: " + teudatZeut + " Name: " + name + " age: " + String.format("%2d", age) + " weight: "
				+ String.format("%.1f", weight) + " " + (married ? "married" : "single" 
		+ " " +createdTime.format(toStringPattern) );
	}

	public static Person getRandomPerson() throws RandomLibraryException {

		int randomTeudatZeut = gen.nextIntRange(100000000, 999999999);

		String randomName = gen.nextString(NAMES_ARRAY);

		int randomAge = gen.nextIntRange(MIN_AGE, MAX_AGE);

		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);

		boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();

		return new Person(randomTeudatZeut, randomName, randomAge, randomWeight, randomMarried);

	}

	public String toCSV() {
		return teudatZeut + ";"+ name + ";" + age + ";" + String.format("%.1f", weight) + ";" + married + ";" + createdTime.format(toStringPattern) ;
	}

}
