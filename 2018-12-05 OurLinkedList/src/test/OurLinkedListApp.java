package test;

import java.util.Iterator;

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
		
		olli.add(6, 33);
		
		//for (int i=0; i<olli.size(); i++)System.out.print(olli.get(i)+"  ");
		//System.out.println();
		
		Iterator<Integer> it = olli.iterator();
		while(it.hasNext())System.out.print(it.next()+"  ");

	}

}
