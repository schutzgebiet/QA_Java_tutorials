package test;

import dto.OwnedCar;
import randomLib.RandomLibraryException;

public class RandomPersonTest {

	private static final int NUM_CARS = 10;
	
//	private static final int NUM_PERSON = 20;
//
//	public static void main(String[] args) {
//		
//		for(int i = 0 ; i<NUM_PERSON; i++)System.out.println(Person.getRandomPerson()); 
//	
//	}
	public static void main(String[] args) throws RandomLibraryException{
		
		for(int i = 0 ; i<NUM_CARS; i++)System.out.println(OwnedCar.getRandomOwnedCar()); 
	}
}
