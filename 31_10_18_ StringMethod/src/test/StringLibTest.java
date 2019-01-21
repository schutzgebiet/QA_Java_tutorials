package test;

import stringLib.OurStringLibrary;

public class StringLibTest {

	public static void main(String[] args) {
		
		String str = "AbraCadaBRa";
		
		System.out.println(OurStringLibrary.ourContains(str, 'e'));
		
		System.out.println(OurStringLibrary.ourIndexOf(str, 'R'));
		
		System.out.println(OurStringLibrary.countChar(str, 'a'));
		
		System.out.println(OurStringLibrary.ourToLowerCase(str));
		
		System.out.println("=========================================");
		String s1 = "Sasha";
		String s2 ="sashA";
		
		System.out.println(s1.equals(s2));
		System.out.println(OurStringLibrary.ourEqualsIgnoreCase(s1, s2));
		
		System.out.println("=========================================");
		String s3 ="qwertyuiop";
		String s4 = "poiuytrewq";
		
		System.out.println(OurStringLibrary.revers(s3));
		System.out.println(OurStringLibrary.revers(s3).equals(s4));
		
		
		System.out.println("=========================================");
		String s5 = "qwertytrewq";
		System.out.println(OurStringLibrary.isPalindrome(s5));
		
		System.out.println(s5.toCharArray()[3]);
		

	}
	
	
	

}
