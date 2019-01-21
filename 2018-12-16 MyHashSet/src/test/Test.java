package test;

import java.util.Random;

import model.OurHashSet;

public class Test {
	
	static Random gen = new Random();

	public static void main(String[] args) {
		OurHashSet<Integer> ohsi = new OurHashSet<>();
		for (int i=0; i<20; i++)ohsi.add(gen.nextInt(1000));
		ohsi.display();
		for (Integer i : ohsi)System.out.print(i+"  ");

	}

}
