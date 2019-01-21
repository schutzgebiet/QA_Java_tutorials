package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Node;
import model.OurLinkedList;

class OurLinkedListTest {
	
	@Test
	void addT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expected =1;
		
		oll.add("BBB");
		
		assertEquals(expected,oll.size());
	}
	
	@Test
	void addT2() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =0;
		
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void addT3() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =1;
		oll.add(null);
		
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void addT4() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =5;
		oll.add("sff");
		oll.add("sff");
		oll.add("sff");
		oll.add("sff");
		oll.add("sff");
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void addLastT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =1;
		oll.addLast("AAA");
		
		assertEquals(expectedSize,oll.size());
	}
	
	
	@Test
	void addLastT2() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.add("AAA");
		oll.add("BBB");
		oll.add("CCC");
		int expectedSize =4;
		String expectedData = "DDD";
		
		oll.addLast("DDD");
		
		assertEquals(expectedData,oll.get(oll.size()-1));
	}
	

	@Test
	void addFirstT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =1;
		oll.addLast("AAA");
		
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void addFirstT2() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		int expectedSize =2;
		oll.addLast("AAA");
		oll.addFirst("CCC");
		
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void addFirstT3() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.add("AAA");
		int expectedSize =2;
		
		oll.addFirst("CCC");
		
		assertEquals(expectedSize,oll.size());
	}
	
	@Test
	void getNodeByIndexT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.addFirst("AAA");
		int position = 0;
		Node<String> expectedNode = new Node<>("AAA");
		
		Node<String> result = oll.getNodeByIndex(position);
		
		assertEquals(expectedNode.getData(),result.getData());
	}
	
	@Test
	void getT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.addFirst("AAA");
		int position = 0;
		String expectedNode = "AAA";
		
		String result = oll.get(position);
		
		assertEquals(expectedNode,result);
	}
	
	@Test
	void getT2() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.addFirst("AAA");
		oll.addFirst("DDD");
		oll.addFirst("CCC");
		int position = 1;
		String expectedNode = "DDD";
		
		String result = oll.get(position);
		
		assertEquals(expectedNode,result);
	}
	
	@Test
	void setT1() {
		OurLinkedList<String> oll = new OurLinkedList<>();
		oll.addFirst("AAA");
		oll.addFirst("DDD");
		oll.addFirst("CCC");
		int position = 1;
		String expectedNode = "FFF";
		
		oll.set(1,"FFF");
		
		String result = oll.get(position);
		
		assertEquals(expectedNode,result);
	}

}
