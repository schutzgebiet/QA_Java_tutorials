package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.OurLinkedList;

class SizeTest {
	
	static OurLinkedList<Integer> olli;
	static final int toTail = 500000;
	static final int toHead = 300000;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		olli = new OurLinkedList<>();
	
		
	}

	@Test
	void test() {
		Random gen = new Random();
		for(int i = 0;i<toTail;i++) {
			olli.addLast(gen.nextInt());
		}
		for(int i = 0;i<toHead;i++) {
			olli.addFirst(gen.nextInt());
		}
		assertTrue(toTail+toHead==olli.size());
	}

}
