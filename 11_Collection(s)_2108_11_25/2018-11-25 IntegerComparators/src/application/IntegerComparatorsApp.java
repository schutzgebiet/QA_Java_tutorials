package application;

import java.util.ArrayList;
import java.util.Collections;

import comparators.DividersComparator;
import comparators.EvensForwardComparator;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class IntegerComparatorsApp {

	private static final int NUM_NUM = 3;
	static RandomExt gen = new RandomExt();
	public static void main(String[] args) throws RandomLibraryException {
		ArrayList<Integer> ali = new ArrayList<>();
		for (int i=0; i<NUM_NUM; i++) ali.add(gen.nextIntRange(0, 100));
		System.out.println(ali);
		
		Collections.sort(ali, new EvensForwardComparator());
		System.out.println(ali);
		
		Collections.sort(ali, new DividersComparator());
		System.out.println(ali);
		

	}

}
