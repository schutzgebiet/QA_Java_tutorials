
public class Test {

	public static void main(String[] args) {
		
		String s1 = "";
		String s2 = null;
		String s3 = new String();
		
		char[] charArray = {'p','e','t','y','a'};
		
		String s4 = new String(charArray,1,3);
		
		String s5 = new String(s4);
		
		//System.out.println(s1.equals(s3));
		
		System.out.println(s5);
		
		String str = "Vasya";
	
		str.concat(s5).concat(str);
		
		System.out.println(str.concat(s5));
		
		System.out.println(str.length());
		
		

	}

}
