package app;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetApp {

	public static void main(String[] args) {
		HashSet<Integer> hsi = new HashSet();
		
		for(int i = 1;i<21;i++) {
			hsi.add(i*100);
		}
		for(Integer i: hsi)System.out.print(i+"  ");
		System.out.println();
		
		LinkedHashSet<Integer> lhsi = new LinkedHashSet<>();
		for(int i = 1;i<21;i++) {
			lhsi.add(i*100);
		}
		System.out.println("==================================");
		for(Integer i: lhsi)System.out.print(i+"  ");
		
	}

}
