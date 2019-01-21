package model;

import java.util.function.Predicate;

public class MultipleOfFilter implements Predicate<Integer>{
	
	int num;
	
	public MultipleOfFilter(int num) {
		this.num = num;
	}

	@Override
	public boolean test(Integer i) {
		return i%num == 0;
	}

}
