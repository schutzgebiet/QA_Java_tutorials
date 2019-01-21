package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OurHashSetIterator<T> implements Iterator<T> {

	ArrayList<ArrayList<T>> hs;
	int currentShelf;
	int current = 0;


	public OurHashSetIterator(ArrayList<ArrayList<T>> hs) {
		this.hs = hs;
		this.currentShelf = 0;
		getNextShelf();

	}

	@Override
	public boolean hasNext() {

		return currentShelf < hs.size();
	}

	@Override
	public T next() {
		if(!hasNext()) throw  new NoSuchElementException();
		
		T res = hs.get(currentShelf).get(current);
		current++;
		if (current >= hs.get(currentShelf).size()) {
			currentShelf++;
			getNextShelf();
			current = 0;
		}
		return res;
	}

	private void getNextShelf() {
		while (currentShelf < hs.size() && hs.get(currentShelf).size() == 0) {
			currentShelf++;
		}
	}

}