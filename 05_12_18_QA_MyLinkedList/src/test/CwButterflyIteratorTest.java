package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import model.OurLinkedList;

class CwButterflyIteratorTest {
		private static final int NUM_NUM = 1000;
		static Random gen = new Random();
		static OurLinkedList<Integer> olli;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 olli = new OurLinkedList<>();
		for(int i = 0; i<NUM_NUM;i++)
		{
			olli.add(gen.nextInt(1000));
		}
	}

	@Test
	void sizeTest() {
		int count = 0;
		for(Integer i : olli) 
			count++;	
		assertTrue(count==olli.size());
		
	}
	
	@Test
	void iteratorTest() {
		ArrayList<Integer> ali = new ArrayList<>();
		for(int i = 0;i<olli.size();i++) {
			ali.add(olli.get(i));
		}
		boolean flag = true;
		for(Integer i :olli) {
			if(!ali.contains(i)) {
			flag = false;
			break;
			}
		}
		assertTrue(flag);	
	}
}
