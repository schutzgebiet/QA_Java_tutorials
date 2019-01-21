package model;

import exceptions.CarWrongDataException;

public class Car {
	private String model;
	private int year;
	private double engine;
	private boolean ac;
	
	public Car() {
	}
	
	public Car(String model,int year,double engine,boolean ac) throws CarWrongDataException {
		try {
			setModel(model);
		} catch (CarWrongDataException e) {
			System.out.println("model is set to default:\"no model name\"");
			this.model = "no model name";
		}
		try {
			setYear(year);
		} catch (CarWrongDataException e) {
			System.out.println("year is set to default: -10000");
			this.year = -10000;
		}
		try {
			setEngine(engine);
		} catch (CarWrongDataException e) {
			System.out.println("engine is set to default: -1.0");
			this.engine = -1.;
		}
		try {
			setAc(ac);
		} catch (CarWrongDataException e) {
			System.out.println("ac is set to default: false");
			this.ac=false;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) throws CarWrongDataException {
		if(model==null) {
			throw new CarWrongDataException("model is null");
		}
		else if (model.length()==0) {
			throw new CarWrongDataException("model is empty"); 
		}
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws CarWrongDataException {
		if(year<1930) {
			throw new CarWrongDataException("year before 1930: " + year);
		}
		else if(year > 2019) {
			throw new CarWrongDataException("year is  greather than 2019");
		}
		this.year = year;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) throws CarWrongDataException {
		if(engine<0.3) {
			throw new CarWrongDataException("engine volume less than 0.3: " + engine);
		}
		else if(engine>5.) {
			throw new CarWrongDataException("engine volume greather than 5.: " + engine);
		}
		this.engine = engine;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) throws CarWrongDataException {
		if(year<1990 && ac) {
			throw new CarWrongDataException("AC can't exist by Cars where year less then 1990");
		}
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", engine=" + engine + ", ac=" + ac + "]";
	}
	
	
	
	
}
