package comparators;

import java.util.Comparator;

public class DividersComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		return numDividers(i1) - numDividers(i2);
	}

	private int numDividers(Integer num) {
		if (num == 0) return Integer.MAX_VALUE;
		if (num == 1) return 1;
		int result = 2;
		int i = 0;
		for (i=2; i*i < num && i*i > 0; i++) {
			if (num%i == 0) result = result + 2;
		}
		if (i*i == num) result = result + 1;
		return result;
	}

}
