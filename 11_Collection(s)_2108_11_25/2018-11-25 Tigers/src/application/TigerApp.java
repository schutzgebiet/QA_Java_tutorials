package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import comparators.StringComparator;
import comparators.StripesComparator;
import comparators.WeightComparator;
import dto.Tiger;
import predicates.MenEaterPredicate;
import randomLib.RandomLibraryException;

public class TigerApp {

	private static final int NUM_TIGERS = 10;

	public static void main(String[] args) throws RandomLibraryException {
		
		ArrayList<Tiger> arrayListTigers = new ArrayList<>();
		for (int i=0; i < NUM_TIGERS; i++)arrayListTigers.add(Tiger.getRandomTiger());
		
		System.out.println("**********All******************");
		System.out.println(arrayListTigers);
		
		Collections.sort(arrayListTigers, new StripesComparator());	
		System.out.println("**********Sorted by stripes******************");
		System.out.println(arrayListTigers);
		
		Collections.sort(arrayListTigers, new WeightComparator());	
		System.out.println("**********Sorted by weight******************");
		System.out.println(arrayListTigers);
		
		Collections.sort(arrayListTigers, new StringComparator());	
		System.out.println("**********Sorted by name******************");
		System.out.println(arrayListTigers);
		
		ArrayList<Tiger> meneaters = filter(arrayListTigers, new MenEaterPredicate());
		System.out.println("**********Meneaters******************");
		System.out.println(meneaters);

	}
	
	public static <T> ArrayList<T> filter(ArrayList<T> orig, Predicate<T> predicate){
		ArrayList<T> result = new ArrayList<>();
		for(T t : orig) {
			if(predicate.test(t)) result.add(t);
		}
		return result;
	}

}
