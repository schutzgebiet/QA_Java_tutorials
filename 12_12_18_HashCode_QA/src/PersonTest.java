import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {
	

	@Test
	void hashCodeT1() {
		Person p1 = new Person("Sasha",61,77.6,true);
		int expected = -1180705931;
		
		int result = p1.hashCode();
		
		assertTrue(expected==result);
	}
	
	@Test
	void equalsT1() {
		Person p1 = new Person("Sasha",61,77.6,true);
		Person p2 = new Person("Sasha",61,77.6,true);
		boolean expected = true;
		
		boolean result = p1.equals(p2);
		
		assertTrue(expected==result);
	}
	
	@Test
	void equalsT2() {
		Person p1 = new Person("Sasha",61,77.6,true);
		boolean expected = true;
		
		boolean result = p1.equals(p1);
		
		assertTrue(expected==result);
	}
	
	@Test
	void equalsT3() {
		Person p1 = new Person("Sasha",61,77.6,true);
		boolean expected = false;
		
		boolean result = p1.equals(null);
		
		assertTrue(expected==result);
	}


}
