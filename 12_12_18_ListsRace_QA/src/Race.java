import java.util.ArrayList;
import java.util.LinkedList;

public class Race {

	private static final int NUM_NUM = 1000000;
	private static final int NUM_HEAD = 10000;

	public static void main(String[] args) {
		
		ArrayList<Integer> ali = new ArrayList<>();
		LinkedList<Integer> lli = new LinkedList<>();
	
		for(int i =0;i<NUM_NUM;i++) {
			ali.add(1);
			lli.add(1);
		}
		
		long t1 = System.currentTimeMillis();
		for(int i = 0;i<NUM_HEAD;i++) {
			ali.add(ali.size(),1);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Array to head: " + (t2-t1)+" ms");
		
		
		t1 = System.currentTimeMillis();
		for(int i = 0;i<NUM_HEAD;i++) {
			lli.addLast(1);
		}
		t2 = System.currentTimeMillis();
		System.out.println("Linked to head: " + (t2-t1)+" ms");
	}

}
