package comparators;

import java.util.Comparator;

public class EvensForwardComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		boolean even1 = i1%2 == 0;
		boolean even2 = i2%2 == 0;
		
		if(even1 == even2) {
			if(even1) return i2-i1;
			else return i1-i2;
		}
		return even1 ? 1 : -1;
	}

}
