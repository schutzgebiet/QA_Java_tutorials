package comparators;

import java.util.Comparator;

import dto.Tiger;

public class StringComparator implements Comparator<Tiger>{

	@Override
	public int compare(Tiger t1, Tiger t2) {
		
		String s1 = t1.getName();
		String s2 = t2.getName();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		int lmin = l2 > l1 ? l1 : l2;
		
		
		for (int i=0; i<lmin; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 > c2) return 1;
			if (c2 > c1) return -1;
			
		}
		
		return l1 - l2;
	}

}
