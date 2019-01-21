package dto;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Car {
	private static final String[] MODEL_ARRAY = {"Honda","Toyota","VolksWagen","Mercedes","BMW","ZAZ","Hundai","Mitzubisi"};

	private static final int MAX_YEAR = 2000;

	private static final double MIN_ENGINE = 1.4;

	private static final double MAX_ENGINE = 2.5;

	private static final int MIN_YEAR = 1960;

	private static RandomExt gen = new RandomExt();
		
	private String model;
	private int year;
	private double engine;
	private boolean ac;
	//private Person owner;
	
	
	public Car(String model, int year, double engine, boolean ac) {
		super();
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.ac = ac;
		//this.owner = owner;
	}


	public Car() {
		
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
		return "Car model: " + model + " year: " + year + " engine: " + String.format("%.1f", engine) + " ac: " + (ac?"YES":"NO");
	}
	
	public static Car randomCar() throws RandomLibraryException{
		
		String randomModel = gen.nextString(MODEL_ARRAY);
		
		int randomYear = gen.nextIntRange(MIN_YEAR, MAX_YEAR);
		
		double randomEngine = gen.nextDoubleRange(MAX_ENGINE, MIN_ENGINE) ;
		
		boolean randomAc = gen.nextBoolean();
		
		// Person randomOwner = Person.getRandomPerson(); 
		
		return  new Car(randomModel,randomYear,randomEngine,randomAc);
	}
	
	
	
	
}
