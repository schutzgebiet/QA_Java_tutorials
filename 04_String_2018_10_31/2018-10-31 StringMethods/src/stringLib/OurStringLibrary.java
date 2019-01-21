package stringLib;

public class OurStringLibrary {
	
	public static boolean ourContains(String str, char c) {
		int strLength = str.length();
		for(int i = 0; i < strLength; i++) {
			if (str.charAt(i) == c) return true;
		}
		return false;
	}
	
	public static int ourIndexOf(String str, char c) {
		int strLength = str.length();
		for (int i = 0; i < strLength; i++) {
			if (str.charAt(i) == c) return i;
		}
		return -1;
	}
	
	public static int countChar(String str, char c) {
		int strLength = str.length();
		int counter = 0;
		for (int i = 0; i < strLength; i++) {
			if(str.charAt(i) == c) counter++;
		}
		return counter;
	}
	
	public static String ourToLowerCase(String str) {
		int strLength = str.length();
		String result = "";
		char c = 0;
		for (int i = 0; i < strLength; i++) {
			c = str.charAt(i);
			if (c > 64 && c < 91) c = (char)(c + 32);
			result = result + c;
		}
		return result;
	}
	
	public static boolean ourEqualsIgnoreCase(String str1, String str2) {
		return ourToLowerCase(str1).equals(ourToLowerCase(str2));
	}
	
	public static String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) result = result + str.charAt(i);
		return result;
	}
	
	public static boolean isPalindrome(String str) {
		return reverse(str).equals(str);
	}

}