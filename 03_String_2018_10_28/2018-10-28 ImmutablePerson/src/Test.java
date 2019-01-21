
public class Test {

	public static void main(String[] args) {
		
		Person person = new Person("Sasha", 60);
		System.out.println(person);
		
		person = new Person(person.getName(), person.getAge()-42);
		System.out.println(person);
	}

}
