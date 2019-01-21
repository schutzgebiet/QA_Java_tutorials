
public class Test {

	public static void main(String[] args) {
		
		String s1 = "";
		String s2 = null;
		String s3 = new String();
		char[] charArray = {'m','a','s','h','a'};
		String s4 = new String(charArray);
		String s5 = new String(s4);
		
		//System.out.println(s1.equals(s3));
		System.out.println(s5);
		
		String str1 = "Vasia";
		String str2 = "Vasia";
		String str3 = "Va" + "sia";
		String str4 = "Va";
		String str5 = "sia";
		String str6 = str4+str5;
		System.out.println(str1==str6);
	

	}

}
