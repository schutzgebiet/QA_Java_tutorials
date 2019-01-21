package application;

import java.util.ArrayList;
import java.util.Comparator;

import Comparators.StringComparator;
import randomLib.RandomExt;

public class BubbleSortWithComparator {

	private static final int NUM_NUM = 20;

	public static void main(String[] args) {
		RandomExt gen = new RandomExt();
		ArrayList<String> als = new ArrayList<>();
		for(int i = 0;i<NUM_NUM;i++)als.add(gen.nextString(10));
		System.out.println(als);
		
		bubbleSort(als,new StringComparator());
		System.out.println(als);
		
	}
	
	public static <T> void bubbleSort(ArrayList<T>alt,Comparator<T> comparator) {
		for(int end = alt.size()-1;maxToEnd(alt,comparator,end);end--);
	}
	
	private static <T> boolean maxToEnd(ArrayList<T>alt,Comparator<T>comparator, int end) {
		boolean flag=false;
		for(int i =0;i<end;i++) {
			if(comparator.compare(alt.get(i),alt.get(i+1))>0) {
				swap(alt,i,i+1);
				flag = true;
			}
		}
		return flag;
	}
	
	private static <T> void swap(ArrayList<T>alt,int i,int j) {
		T pocket = alt.get(i);
		alt.set(i, alt.get(j));
		alt.set(j, pocket);
	}

}
