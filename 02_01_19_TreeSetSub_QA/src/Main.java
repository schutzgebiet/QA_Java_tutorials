import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> tsi = new TreeSet<>();
		
		tsi.add(1);
		tsi.add(3);
		tsi.add(4);
		tsi.add(5);
		tsi.add(7);
		
		System.out.println(tsi);
		
		Set<Integer> sub = new TreeSet(tsi.subSet(2, 6));
		System.out.println(sub);
		
		sub.add(2);
		System.out.println(sub);
		System.out.println(tsi);
		
		sub.remove(4);
		System.out.println(sub);
		System.out.println(tsi);
	}

}
