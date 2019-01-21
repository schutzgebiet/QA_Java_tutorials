package Comparators;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
		int lmin = l1>l2?l1:l2;
		
		for(int i=0;i<lmin;i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if(c1>c2)return 1;
			if(c2>c1)return -1;
		}
		return l1 - l2;
	}

}
