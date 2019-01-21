
public class WrappingCalssesTest {

	public static void main(String[] args) {
		
		int iPrymitive = 1000;
		int iPrimitive1 = 1000;
		
		System.out.println(iPrymitive == iPrimitive1);
		
		Integer iClass = new Integer(1000);
		Integer iClass1 = new Integer(1000);
		
		System.out.println(iClass == iClass1);
		System.out.println(iClass.equals(iClass1));
		
		System.out.println("============================================");
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer a = 3;
		Integer b = 513;
		
		System.out.println(Integer.max(a,b));
		System.out.println(Integer.min(a, b));
		
		String c = "1234";
		
		System.out.println(Integer.parseInt(c));
		System.out.println(Double.parseDouble("3.5E6"));
		System.out.println(Boolean.parseBoolean("true"));
		
		System.out.println(Integer.parseInt("1000001", 2));
		
		System.out.println("========================================");
		
		System.out.println(b.toString());
		System.out.println(Integer.toString(b));
		
		System.out.println(Integer.toString(b, 2));
		
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println(Integer.toHexString(b));
		
		System.out.println("=====================================================");
		
		Long IClass = new Long(1234567898L);
		
		long l1 = IClass;
		
		//long l2 = Long.valueOf(IClass); etot proces ne nujen
		
		
	}

}
