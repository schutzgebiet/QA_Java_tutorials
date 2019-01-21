package stringLib;

public class OurStringLibrary {

	
	public static boolean ourContains(String str, char c) {
		int strLenght = str.length();
		for(int i =0; i<strLenght; i++) {
			if(str.charAt(i) == c) return true;
		}
		return false;
	}
	
	public static int ourIndexOf(String str, char c) {
		int strLenght = str.length();
		for(int i = 0 ; i < strLenght; i++) {
			if(str.charAt(i) == c)return i;
		}
		return -1;
		
	}
	
	public static int countChar(String str, char c) {
		int strLenght = str.length();
		int count = 0;
		for(int i =0; i<strLenght; i++) {
			if(str.charAt(i) == c) count++;
		}
		return count;
	}
	
	public static String ourToLowerCase(String str) {
		int strLenght = str.length();
		String result ="";
		char c = 0;
		for(int i =0 ; i < strLenght; i++) {
			c = str.charAt(i);
			if(c>64 && c < 91) c = (char)(c + 32);
			result = result + c;
		}
		return result;
	}
	
	public static boolean ourEqualsIgnoreCase(String str1, String str2) {
		return ourToLowerCase(str1).equals(ourToLowerCase(str2));
	}
	
	public static String revers(String str) {
		String res = "";
		int strLenght = str.length();
		for(int i = strLenght-1 ; i >= 0; i--) res = res + str.charAt(i);
		return res;
	}
	
	public static boolean isPalindrome(String str) {
	return revers(str).equals(str);
	}
}
