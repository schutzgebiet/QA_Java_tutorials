
public class MainTest {

	public static void main(String[] args) {
		
		f1();
		
		System.out.println("main finished");

	}

	private static void f1() {
		
		try {
			f2();
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
		
		
		
		System.out.println("f1 finished");
		
	}

	private static void f2() {
		
		int i = 0;
		try {
			i = Integer.parseInt("123");
//			String str = null;
//			str.length();
			int[] arr = new int[100];
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		System.out.println("f2 finished, i = " + i);
		
	}

}
