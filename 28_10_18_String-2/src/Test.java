
public class Test {

	public static void main(String[] args) {
		
		String str = "muther fucker";
		String str1 = "muther fucke";
		
		
		
		int strLenght = str.length();
		
		for(int i = 0 ; i<strLenght;i++)
			System.out.println(str.charAt(i));
		
		System.out.println(ourEquals(str,str1));
	}
	
	public static boolean ourEquals(String s1,String s2) {
		
		int l1 = s1.length();
		
		int l2 = s2.length();
		
		if(l1 != l2) return false;
		
		for(int i =0 ; i<l1; i++) {
			if(s1.charAt(i) != s2.charAt(i)) return false;
		}
		
		return true;
	}

}
