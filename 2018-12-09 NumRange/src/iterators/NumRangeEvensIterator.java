package iterators;

import java.util.Iterator;

import model.NumRange;

public class NumRangeEvensIterator implements Iterator<Integer>{

	private int current;
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
		int res = current;
		current = current + 2;
		return res;
	}
	
}
