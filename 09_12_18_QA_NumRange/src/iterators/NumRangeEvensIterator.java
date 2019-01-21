package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.NumRange;

public class NumRangeEvensIterator implements Iterator<Integer>{
	private int current=0;
	private int max;
	
	public NumRangeEvensIterator(NumRange numRange) {
		current = numRange.getMin();
		if(current%2 != 0)current++;
		max = numRange.getMax();
	}

	@Override
	public boolean hasNext() {
	  
	    return current <= max;
	}

	@Override
	public Integer next() {
		if(!hasNext())throw new NoSuchElementException();
		int res = current;
		current = current +2;
		return res;
	}
}
