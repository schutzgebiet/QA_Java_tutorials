package application;

import java.io.IOException;

import MyException.PersonDataException;
import dto.Person;

public class PersonApp {

	public static void main(String[] args) throws PersonDataException, IOException {
		
		Person person = new Person();		
		System.out.println(person);
		
		
		
//		person.setFirstNameInTheConsole();
//		person.setSecondNameInTheConsole();
//		person.setYearInTheConsole();
//		person.setWeightInTheConsole();
//		person.setMarriedInTheConsole();
//		System.out.println(person);		
		
		
		
		
//		person.setPersonInTheConsole();		
		System.out.println(person);
		
		
	}
}
