package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleApp {
	
	private static final int NUM_NUM = 20;
	static Random gen = new Random();
	public static void main(String[] args) {
		
		ArrayList<Integer> ali = new ArrayList<>();
		for (int i=0; i<NUM_NUM; i++) ali.add(gen.nextInt(100));
		System.out.println(ali);
		
		Collections.sort(ali);
		System.out.println(ali);
		
		//Collections.shuffle(ali);
		//System.out.println(ali);
		
		System.out.println(Collections.binarySearch(ali, 30));
		
		
	}

}
