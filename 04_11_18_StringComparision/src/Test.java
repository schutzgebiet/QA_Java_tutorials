import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		
		String str1 = "abcdefg";
		String str2 = "abcd";
		
		System.out.println(ourCompare(str1,str2));
		System.out.println(str1.compareTo(str2));
		System.out.println();
		
		String[] arrStr = {"abc","abb","abcd","bab",null,"bba","acb","abb"};
		bubbleSortString(arrStr);
		 System.out.println(Arrays.toString(arrStr));
		 

	}
	
	public static int ourCompare(String str1, String str2) {
		//returns int > 0 if str1 > str2 lexicographically
		//returns int = 0 if str1 = str2 lexicographically
		//returns int < 0 if str1 < str2 lexicographically
		if(str1 == null && str2 == null) return 0;
		if(str1 == null) return 1;
		if(str2 == null) return -1;
		
		int l1 = str1.length();
		int l2 = str2.length();
		
		int lmin = l1 > l2 ? l2 : l1;
		
		//if(l1 > l2) lmin = l2;
		//else lmin = l1;
		
		int difference = 0;
		for(int i = 0 ; i<lmin; i++) {
			difference = str1.charAt(i) - str2.charAt(i);
			System.out.println("=== " + difference);
			if(difference != 0) return difference;
		}
		
		return l1 - l2;
	}
	
	public static void swap(String[] arr, int i, int j) {
		String tmp = arr[i];
		arr[i]= arr[j];
		arr[j] = tmp;
	}
	
	public static boolean maxToEnd(String[] arr, int end) {
		boolean flag = false;
		for(int i = 1; i<=end; i++) {
			if(ourCompare(arr[i-1],arr[i])>0) {
				swap(arr, i-1, i);
				flag = true;
			}
		}
		return flag;
	}
	
	public static void bubbleSortString(String[] arr) {
		for(int end = arr.length-1;maxToEnd(arr,end) ;end--);
	}

}
