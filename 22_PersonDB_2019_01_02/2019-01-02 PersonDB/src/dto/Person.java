package dto;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person {
	
	private static RandomExt gen = new RandomExt();
	
	private static final int NAME_LENGTH = 12;
	private static final int MAX_AGE = 120;
	private static final double MIN_WEIGHT = 10.;
	private static final double MAX_WEIGHT = 100.;
	private static final int MIN_MARRIED_AGE = 18;
	
	private static final String[] NAMES_ARRAY = 
		{"Sasha","Masha","Dasha","Pasha","Glasha","Arcasha","Misha","Moisha","Natasha","Abrasha"};

	
	private int teudatZeut;
	private String name;
	private int age;
	private double weight;
	private boolean married;
	
	public Person() {
		super();
	}

	public Person(int teudatZeut, String name, int age, double weight, boolean married) {
		super();
		this.teudatZeut = teudatZeut;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
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
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (married != other.married)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teudatZeut != other.teudatZeut)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TZ = "+teudatZeut+", name = " + name + ", age =" 
						+ String.format("%4d", age) + ", weight = " 
	                    + String.format("%.1f", weight) + ","  
	                    + (married ? "  married" : "  single");
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
	
	public static Person getRandomPerson() throws RandomLibraryException {
		
			int randomTZ = gen.nextIntRange(100000000, 999999999);
			String randomName = gen.nextString(NAMES_ARRAY);
			int randomAge = gen.nextInt(MAX_AGE);
			double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
			boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();
			
			return new Person(randomTZ, randomName, randomAge, randomWeight, randomMarried);
	}
	
	

}
