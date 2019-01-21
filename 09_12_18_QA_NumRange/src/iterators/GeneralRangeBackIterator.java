package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.NumRange;

public class GeneralRangeBackIterator implements Iterator<Integer>{
	private int min;
	//private int max;
	private int current=0;
	
	
	public GeneralRangeBackIterator(NumRange numRange) {
		 min = numRange.getMin();
		// max = numRange.getMax();
		 current = numRange.getMax();;
	}

	@Override
	public boolean hasNext() {
	
		return current >= min;
	}

	@Override
	public Integer next() {
		if(!hasNext())throw new NoSuchElementException();
		return current--;
	}

}
