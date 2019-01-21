package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.NumRange;
import model.WrongDataException;

class NumRangeIteratorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() throws WrongDataException {
		int min = -1000000000;
		int max = 1000000000;
		
		int counter = 0;
		NumRange numRange = new NumRange(min, max);
		
		for (Integer i : numRange)counter++;
		assertTrue(counter == max-min+1);
	}

}
