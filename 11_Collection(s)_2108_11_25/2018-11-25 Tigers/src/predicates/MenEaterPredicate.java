package predicates;

import java.util.function.Predicate;

import dto.Tiger;

public class MenEaterPredicate implements Predicate<Tiger>{

	@Override
	public boolean test(Tiger t) {
		return t.isMeneater();
	}

}
