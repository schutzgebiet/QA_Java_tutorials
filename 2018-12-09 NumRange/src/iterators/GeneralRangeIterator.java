package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.NumRange;

public class GeneralRangeIterator implements Iterator<Integer>{

	private int min;
	private int max;
	
	private int current;
	
	public GeneralRangeIterator(NumRange numRange) {
		min = numRange.getMin();
		max = numRange.getMax();
		current = min;
	}
	
	
	@Override
	public boolean hasNext() {
		return current <= max;
	}

	@Override
	public Integer next() {
		if(!hasNext()) throw new NoSuchElementException();
		return current++;
	}

}
