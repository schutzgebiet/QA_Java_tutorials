

import java.util.Iterator;

import model.OurLinkedList;

public class OurLinkedListApp {

	public static void main(String[] args) {

		OurLinkedList<Integer> olli = new OurLinkedList<>();

//		olli.add(44);
//		olli.add(-8);
//		olli.add(11);
//		olli.add(2);
//		olli.add(89);
//	    olli.set(0, 100);
//
//		System.out.println(olli.add(1, 55));
//		System.out.println(olli.add(2, 77));
//		olli.add(22);
//		olli.add(33);
//		olli.add(81);
//		olli.add(92);
//		olli.add(103);
//		olli.add(105);
//
//		for (int i = 0; i < olli.size(); i++) {
//			System.out.print(olli.get(i) + " ");
//		}
//		System.out.println();
//		
//		System.out.println("==============================");
//		
//		Iterator<Integer> it = olli.iterator();
//		while(it.hasNext())System.out.print(it.next()+" ");
		for (int i = 0; i < 20; i++)olli.add(i);
		for(Integer i : olli)System.out.print(i+" ");

	}
	 
}
