package application;

import java.util.Arrays;

public class OurSplitApp {
	public static void main(String[] args) {
		String s = "http://mySite/add?author=Tolstoy&title=Buratino&year=2018&price=47.50&pictures=true";
		System.out.println(Arrays.toString(ourSplit(s,'=')));
		
		

	}

	public static String[] ourSplit(String orig, char c) {
		if(orig==null || c==0) {
			String[] result = new String[1];
			result[0] ="0";
			return result;
		}
		int numC = countChar(orig, c);
		String[] result = new String[numC + 1];
		int from = 0;
		int counter = 0;
		int index = 0;
		while (true) {
			index = orig.indexOf(c, from);
			if (index < 0) {
				result[counter] = orig.substring(from);
				break;
			} else {
				result[counter] = orig.substring(from, index);
				from = index + 1;
				counter++;
			}
		}
		return result;

	}

	private static int countChar(String str, char c) {
		int counter = 0;
		int from = 0;
		int index = 0;
		while (true) {
			index = str.indexOf(c, from);
			if (index < 0)
				break;
			else {
				counter++;
				from = index + 1;
			}
		}
		return counter;
	}
}
