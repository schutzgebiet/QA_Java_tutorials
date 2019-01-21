package model;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Model {
	
	public static <T> ArrayList<T> filter(ArrayList<T> orig, Predicate<T> predicate){
		ArrayList<T> result = new ArrayList<>();
		for(T t : orig) {
			if(predicate.test(t)) result.add(t);
		}
		return result;
	}
}
