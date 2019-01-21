import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		boolean positiv1 = i1>0;
		boolean positiv2 = i2>0;
		
		if(positiv1 != positiv2)return positiv1 ? 1:-1;
		
		
		return i1-12;
	}

}
