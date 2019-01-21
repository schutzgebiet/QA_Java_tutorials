package dto;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Car {
	
	private static final String[] MODEL_ARRAY = 
		{"UAZ", "ZAZ", "TAZ","KAMAZ", "LiAZ"};
	private static final int MIN_YEAR = 1965;
	private static final int MAX_YEAR = 1989;
	private static final double MIN_ENGINE = 0.7;
	private static final double MAX_ENGINE = 2.3;
	private static final double AC_PROBABILITY = 0.2;

	private static RandomExt gen = new RandomExt();

	private String model;
	private int year;
	private double engine;
	private boolean ac;
	
	public Car() {
		super();
	}

	public Car(String model, int year, double engine, boolean ac) {
		super();
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.ac = ac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Car model=" + model + ", year=" + year + ", engine=" + 
				String.format("%.2f", engine) + ", mazgan: " + (ac ? "yes" : "no");
	}
	
	public static Car getRandomCar() throws RandomLibraryException {
		
		String randomModel = gen.nextString(MODEL_ARRAY);
		int randomYear = gen.nextIntRange(MIN_YEAR,  MAX_YEAR);
		double randomEngine = gen.nextDoubleRange(MIN_ENGINE, MAX_ENGINE);
		boolean randomAC = gen.randomBoolean(AC_PROBABILITY);
		
		return new Car(randomModel, randomYear, randomEngine, randomAC);
	}
	
	
}
