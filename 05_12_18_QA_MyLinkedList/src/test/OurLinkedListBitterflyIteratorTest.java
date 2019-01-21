package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import iterators.OurLinkedListBitterflyIterator;
import model.OurLinkedList;

class OurLinkedListBitterflyIteratorTest {
	private static final int NUM_NUM = 20;

	int sum(OurLinkedList<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		return sum;
	}

	@Test
	void testSize() {
		OurLinkedList<Integer> olli = new OurLinkedList<>();
		for (int i = 0; i < NUM_NUM; i++) {
			olli.add(i);
		}
		Iterator<Integer> btr = olli.iterator();
		int count = 0;
		while (btr.hasNext()) {
			btr.next();
			count++;
		}
		assertTrue(olli.size() == count);
	}

	@Test
	void testOfSumArrayValues() {
		OurLinkedList<Integer> olli = new OurLinkedList<>();
		for (int i = 0; i < NUM_NUM; i++) {
			olli.add(i);
		}
		Iterator<Integer> btr = olli.iterator();
		int sum = 0;
		while (btr.hasNext()) {
			sum = sum + olli.get(btr.next());
		}
		assertTrue(sum(olli) == sum);
	}
	/*
	 * @Test void testSize() { int count = 0; OurLinkedList<Integer> olli = new
	 * OurLinkedList<>(); for (int i = 0; i < NUM_NUM; i++) { olli.add(i); count++;
	 * } assertTrue(count == olli.size()); }
	 * 
	 * 
	 * @Test void testOfSumArrayValues() { OurLinkedList<Integer> olli = new
	 * OurLinkedList<>(); for (int i = 0; i < NUM_NUM; i++) { olli.add(i); }
	 * olli.add(2); olli.add(4); olli.add(1); olli.add(6); olli.add(8);
	 * olli.add(14); int sum = 0; for (int i = 0; i < olli.size(); i++) { sum = sum
	 * + olli.get(i); } assertTrue(sum(olli) == sum); }
	 */

}
