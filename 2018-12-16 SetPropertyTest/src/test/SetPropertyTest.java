package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SetPropertyTest {
	
	private static final int NUM_NUM = 1000;
	static Random gen = new Random();
	static HashSet<Integer> hsi;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hsi = new HashSet<>();
		for (int i=0; i<NUM_NUM; i++)hsi.add(gen.nextInt(1000));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
