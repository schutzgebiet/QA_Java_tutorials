package comparators;

import java.util.Comparator;

import dto.Tiger;

public class WeightComparator implements Comparator<Tiger>{

	@Override
	public int compare(Tiger t1, Tiger t2) {
		double w1 = t1.getWeight();
		double w2 = t2.getWeight();
		
		return w1 == w2 ? 0 : w1 > w2 ? 1 : -1;
	}

}
