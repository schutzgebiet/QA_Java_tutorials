package dto;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Tiger {
	
	private static final int MIN_STRIPES = 10;
	private static final int MAX_STRIPES = 20;
	private static final double MIN_WEIGHT = 100;
	private static final double MAX_WEIGHT = 200;

	public static RandomExt gen = new RandomExt();
	
	private String name;
	private int numberOfStripes;
	private double weight;
	private boolean meneater;
	public Tiger() {
		super();
	}
	public Tiger(String name, int numberOfStripes, double weight, boolean meneater) {
		super();
		this.name = name;
		this.numberOfStripes = numberOfStripes;
		this.weight = weight;
		this.meneater = meneater;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfStripes() {
		return numberOfStripes;
	}
	public void setNumberOfStripes(int numberOfStripes) {
		this.numberOfStripes = numberOfStripes;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isMeneater() {
		return meneater;
	}
	public void setMeneater(boolean meneater) {
		this.meneater = meneater;
	}
	@Override
	public String toString() {
		return "\nTiger [name=" + name + ", numberOfStripes=" + numberOfStripes + ", weight=" + String.format("%.2f", weight) + ", meneater="+
				meneater + "]";
	}
	
	public static Tiger getRandomTiger() throws RandomLibraryException {
		String randomName = gen.nextString(6);
		int randomStripes = gen.nextIntRange(MIN_STRIPES, MAX_STRIPES);
		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
		boolean randomMeneater = gen.randomBoolean(0.3);
		
		return new Tiger(randomName, randomStripes, randomWeight, randomMeneater);
	}
	
	

}
