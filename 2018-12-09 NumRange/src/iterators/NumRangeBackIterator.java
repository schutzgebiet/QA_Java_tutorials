package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.NumRange;

public class NumRangeBackIterator implements Iterator<Integer>{
	
	private int min;
	private int current;
	
	public NumRangeBackIterator(NumRange numRange) {
		min = numRange.getMin();
		current = numRange.getMax();
	}

	@Override
	public boolean hasNext() {
		return current >= min;
	}

	@Override
	public Integer next() {
		if(!hasNext()) throw new NoSuchElementException();
		return current--;
	}
	
	

}
