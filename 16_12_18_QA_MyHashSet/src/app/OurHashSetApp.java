package app;

import java.util.ArrayList;
import java.util.Random;

import model.OurHashSet;

public class OurHashSetApp {
	
	public static void main(String[] args) {
		Random gen = new Random();
		OurHashSet<Integer> ohsi = new OurHashSet<>();
		for(int i = 0 ; i<10;i++)ohsi.add(gen.nextInt(1000));
		ohsi.displey();
		System.out.println(ohsi.size());
		System.out.println("=======================");
		
		
		
		for(Integer i : ohsi) {
			System.out.print(i+" ");
		}

	}

}
