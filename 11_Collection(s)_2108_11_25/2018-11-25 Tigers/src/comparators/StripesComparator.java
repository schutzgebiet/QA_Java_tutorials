package comparators;

import java.util.Comparator;

import dto.Tiger;

public class StripesComparator implements Comparator<Tiger> {

	@Override
	public int compare(Tiger t1, Tiger t2) {
		return t1.getNumberOfStripes() - t2.getNumberOfStripes();
	}

}
