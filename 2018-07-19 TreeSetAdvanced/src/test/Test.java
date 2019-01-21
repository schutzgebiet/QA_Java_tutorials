package test;

import java.util.Random;

import model.MyTreeSet;

public class Test {
	
	private static final int NUM_NUM = 1000000;
	static Random gen = new Random();

	public static void main(String[] args) {
		MyTreeSet<Integer> mtsi = new MyTreeSet<>();
		for (int i=0; i<NUM_NUM; i++)mtsi.add(gen.nextInt());
		System.out.println(mtsi.deep());
		
	}

}
