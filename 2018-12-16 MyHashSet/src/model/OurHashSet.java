package model;

import java.util.ArrayList;
import java.util.Iterator;

public class OurHashSet<T> implements Iterable<T>{

	private static final int NUM_SHELVES = 10;
	private ArrayList<ArrayList<T>> hs = new ArrayList<>();
	private int size = 0;
	
	public OurHashSet() {
		for (int i=0; i<NUM_SHELVES; i++) {
			hs.add(new ArrayList<T>());
		}
	}
	
	public boolean add(T data) {
		if (contains(data)) return false;
		
		int hc = data.hashCode();
		hc = hc >= 0 ? hc : -hc;
		int numShelf = hc%10;
		hs.get(numShelf).add(data);
		size++;
		
		return true;
	}
	
	public boolean contains(T data) {
		int hc = data.hashCode();
		hc = hc >= 0 ? hc : -hc;
		int numShelf = hc%10;
		return hs.get(numShelf).contains(data);
	}
	
	public void display() {
		for (ArrayList<T> alt : hs)System.out.println(alt);
	}
	
	public int size() {return size;}

	@Override
	public Iterator<T> iterator() {
		return new  OurHashSetIterator<T>(hs);
	}
	
	
	
}
