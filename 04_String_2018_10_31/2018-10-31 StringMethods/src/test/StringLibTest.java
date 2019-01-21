package test;

import java.util.Arrays;

import stringLib.OurStringLibrary;

public class StringLibTest {

	private static final int UPPER_LOWER_SHIFT = 32;

	public static void main(String[] args) {
		
		String str = "Abr;] {aCa98daBRa@";
		System.out.println(OurStringLibrary.ourContains(str, 'e'));
		System.out.println(OurStringLibrary.ourIndexOf(str, 'R'));
		System.out.println(OurStringLibrary.countChar(str, 'm'));
		System.out.println(OurStringLibrary.ourToLowerCase(str));
		
		String s1 = "Sasha";
		String s2 = "sashA";
		
		System.out.println(s1.equals(s2));
		System.out.println(OurStringLibrary.ourEqualsIgnoreCase(s1, s2));
		
		String s3 = "qwertyuiop";
		String s4 = "poiuytrewq";
		
		System.out.println(OurStringLibrary.reverse(s3));
		System.out.println(OurStringLibrary.reverse(s3).equals(s4));
		
		String str5 = "qwertytrewq";
		System.out.println(OurStringLibrary.isPalindrome(str5));
		
		System.out.println((char)(str5.toCharArray()[3]-UPPER_LOWER_SHIFT));
		System.out.println(Arrays.toString(str5.getBytes()));

	}

}
