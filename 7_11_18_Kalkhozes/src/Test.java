
public class Test {

	public static void main(String[] args) {
		
		
		Kolkhoz[] kkk = new Kolkhoz[3];
		for(int i =0;i<kkk.length;i++)kkk[i] = new Kolkhoz();
		
		System.out.println("kolkhoz#0: " + kkk[0].getZakroma());
		System.out.println("kolkhoz#1: " + kkk[1].getZakroma());
		System.out.println("kolkhoz#2: " + kkk[2].getZakroma());
		
		System.out.println("=================================");
		
		kkk[0].harvest();
		kkk[1].harvest();
		kkk[2].harvest();
		
		System.out.println("kolkhoz#0: " + kkk[0].getZakroma());
		System.out.println("kolkhoz#1: " + kkk[1].getZakroma());
		System.out.println("kolkhoz#2: " + kkk[2].getZakroma());
	}

}
