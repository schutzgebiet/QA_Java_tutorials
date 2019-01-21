import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SortTest {
  
  private static final int NUM_NUM = 1000000;
  static Random gen = new Random();
  static ArrayList<Integer> ali;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    ali = new ArrayList<>();
    for(int i = 0; i < NUM_NUM;i++) {
      ali.add(gen.nextInt());
    }
  }

  @Test
  void testSort() {
    Collections.sort(ali);
    boolean flag = true;
    int arrayListSize = ali.size();
    for(int i = 1; i < arrayListSize;i++) {
      if(ali.get(i) < ali.get(i-1)) {
        flag = false;
        break;
      }
    }
    assertTrue(flag);
      
  }
  
  @Test
  void testSize() {
	  assertTrue(ali.size()==NUM_NUM);
  }
  
  }
