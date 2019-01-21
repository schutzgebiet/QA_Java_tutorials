package dto;

public class Truck extends Car{
	private double weight;

	public Truck(String model, int year, double engine, boolean ac, double weight) {
		super(model, year, engine, ac);
		this.weight = weight;
	}

	public Truck() {
		super();
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"Truck [weight=" + weight + "]";
	}
	
	
}
