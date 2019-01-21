package dto;

import randomLib.RandomExt;

public class Person {
	
	private static final int NAME_LENGTH = 12;
	private static final int MAX_AGE = 120;
	private static final double MIN_WEIGHT = 10.;
	private static final double MAX_WEIGHT = 100.;
	private static final int MIN_MARRIED_AGE = 18;
	
	private static final String[] NAMES_ARRAY = 
		{"Sasha","Masha","Dasha","Pasha","Glasha","Arcasha","Misha","Moisha","Natasha","Abrasha"};

	private static RandomExt gen = new RandomExt();
	
	private String name;
	private int age;
	private double weight;
	private boolean married;
	
	public Person() {
		super();
	}

	public Person(String name, int age, double weight, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
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

	@Override
	public String toString() {
		return "Person [name = " + name + ", age =" 
						+ String.format("%4d", age) + ", weight = " 
	                    + String.format("%.1f", weight) + ","  
	                    + (married ? "  married" : "  single")+ "]";
	}
	
	public static Person getRandomPerson() {
		String randomName = gen.nextString(NAMES_ARRAY);
		int randomAge = gen.nextInt(MAX_AGE);
		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
		boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();
		
		return new Person(randomName, randomAge, randomWeight, randomMarried);
	}
}
