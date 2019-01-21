
public class Person {

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
	
	
	
	
}
