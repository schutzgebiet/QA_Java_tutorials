package dto;

public class Car implements Comparable<Car>{
	
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
		return "Car [model=" + model + ", year=" + year + ", engine=" + engine + ", ac=" + ac + "]";
	}

	@Override
	public int compareTo(Car other) {
		return this.engine > other.engine ? 1 : (this.engine < other.engine ? -1 : 0);
	}
	
	

}
