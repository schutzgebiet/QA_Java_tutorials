package model;

import java.util.Comparator;

public class NaturalComparator<T> implements Comparator<T>{

	@Override
	public int compare(T t1, T t2) {
			return ((Comparable<T>)t1).compareTo(t2);
	}

}
