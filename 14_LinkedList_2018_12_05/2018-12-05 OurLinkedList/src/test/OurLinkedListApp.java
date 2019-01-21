package test;

import model.OurLinkedList;

public class OurLinkedListApp {

	public static void main(String[] args) {
		
		OurLinkedList<Integer> olli = new OurLinkedList<>();
		
		olli.add(3);
		olli.add(-8);
		olli.add(11);
		olli.add(2);
		
		olli.addFirst(7);
		olli.addFirst(-5);
		olli.addFirst(0);
		olli.addFirst(1);
		
		for (int i=0; i<olli.size(); i++)System.out.print(olli.get(i)+"  ");
		System.out.println();

	}

}
