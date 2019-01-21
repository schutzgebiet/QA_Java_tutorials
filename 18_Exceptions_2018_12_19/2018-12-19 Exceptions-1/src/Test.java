
public class Test {

	public static void main(String[] args) {
		
		f1();
		
		System.out.println("main finished");

	}

	private static void f1() {
		
		try {
			f2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("f1 finished");
		
	}

	private static void f2() {
		
		int i=0;
			i = Integer.parseInt("123");
			//String str = null;
			//str.length();
			int[] arr = new int[1000000000];
		
		System.out.println("f2 finished, i="+i);
		
	}

}
