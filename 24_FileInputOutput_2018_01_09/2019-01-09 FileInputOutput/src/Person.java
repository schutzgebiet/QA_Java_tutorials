import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person {
	
	private static final String[] NAMES = {"Sasha","Masha","Pasha","Glasha","Dasha","Natasha","Grusha","Misha","Moisha","Arkasha"};
	private static final int MIN_AGE = 18;
	private static final int MAX_AGE = 90;
	private static final double MIN_WEIGHT = 45.;
	private static final double MAX_WEIGHT = 90.;
	private static final double MARRIED_PROBABILITY = 0.5;

	private static RandomExt gen = new RandomExt(); 

	private String name;
	private int age;
	private double weight;
	private boolean married;
	
	public Person(String name, int age, double weight, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
	}

	public Person() {}
	
	public static Person getPerson(String csv, String delimiter) {
		String[] fields = csv.split(delimiter);
		String n = fields[0];
		int a = Integer.parseInt(fields[1]);
		double w = Double.parseDouble(fields[2]);
		boolean m = Boolean.parseBoolean(fields[3]);
		
		return new Person(n, a, w, m);
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
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", married=" + married + "]";
	}
	
	public String toCSV() {
		return name+";"+age+";"+String.format("%.1f",weight)+";"+married;
	}
	
	public static Person getRandomPerson() throws RandomLibraryException {
		
		String n = gen.nextString(NAMES);
		int a = gen.nextIntRange(MIN_AGE, MAX_AGE);
		double w = gen.nextDoubleRange(MIN_WEIGHT,  MAX_WEIGHT);
		boolean m = gen.nextBoolean(MARRIED_PROBABILITY);
		
		return new Person(n,a,w,m);
		
	}
	
	
	
	
}
