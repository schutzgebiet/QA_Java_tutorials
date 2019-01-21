
public class HashCodeApp {

	public static void main(String[] args) {
		
		Person p1 = new Person("Sasha",61,77.6,true);
		Person p2 = new Person("Sasha",61,77.6,true);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
