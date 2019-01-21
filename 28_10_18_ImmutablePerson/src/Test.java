
public class Test {

	public static void main(String[] args) {
		
		Person person = new Person("Vova",30);
		System.out.println(person);
		person = new Person(person.getName(),person.getAge()-12);
		System.out.println(person);

	}

}
