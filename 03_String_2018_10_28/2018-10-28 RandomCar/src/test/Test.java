package test;

import dto.Car;
import dto.OwnedCar;
import randomLib.RandomLibraryException;

public class Test {

	private static final int NUM_CARS = 20;

	public static void main(String[] args) throws RandomLibraryException {
		
		for (int i=0; i<NUM_CARS; i++)System.out.println(OwnedCar.getRandomOwnedCar());

	}

}
