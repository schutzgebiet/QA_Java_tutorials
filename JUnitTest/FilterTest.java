package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Model;
import model.MultipleOfFilter;

class FilterTest {
	
	static int NUM_NUM = 1000000;
	static int DIVIDER = 100000;
	static Random gen = new Random();
	static ArrayList<Integer> ali;
	static MultipleOfFilter filter;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ali = new ArrayList<>();
		for (int i=0; i<NUM_NUM; i++)ali.add(gen.nextInt());
		filter = new MultipleOfFilter(DIVIDER);
	}

	@Test
	void test() {
		boolean flag = true;	
		
		ArrayList<Integer> filtered = Model.filter(ali, filter);
		filtered.remove(0);
		
		for (Integer i : ali) {
			if (filter.test(i) == filtered.contains(i)) continue;
			flag = false;
			break;
		}
		
		if (flag) {
			for (Integer i : filtered) {
				if (ali.contains(i))continue; 
				flag = false;
				break;
			}
		}
		
		assertTrue(flag);	
	}

}
