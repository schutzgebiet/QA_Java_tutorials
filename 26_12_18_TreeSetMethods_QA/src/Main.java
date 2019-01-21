import java.util.Random;
import java.util.TreeSet;

public class Main {
	
	private static final int NUM_NUM = 20;
	static Random gen = new Random(123456789);
	
	public static void main(String[] args) {
		TreeSet<Integer> tsi = new TreeSet<>();
		for(int i = 0;i<NUM_NUM;i++) {
			tsi.add(gen.nextInt(100));
		}
		
		for(Integer i : tsi) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		System.out.println(tsi.ceiling(3));
		
		System.out.println(tsi.higher(30));
		System.out.println(tsi.lower(60));
		
		for(Integer i : tsi.headSet(30,true)) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		for(Integer i : tsi.tailSet(60)) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		for(Integer i : tsi.headSet(60,true).tailSet(30)) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
