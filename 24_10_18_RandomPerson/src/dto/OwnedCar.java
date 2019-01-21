package dto;

import randomLib.RandomLibraryException;

public class OwnedCar extends Car{
	
	private Person owner;
	
	public OwnedCar() {
		super();
	}

	public OwnedCar(String model, int year, double engine, boolean ac, Person owner) {
		super(model, year, engine, ac);
		this.owner = owner;
	}
	
	public OwnedCar(Car car) {
		super(car.getModel(),car.getYear(),car.getEngine(),car.isAc());
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return super.toString() + " OwnedCar: " + owner;
	}

	public static OwnedCar getRandomOwnedCar() throws RandomLibraryException {
		/*Car car = randomCar();
		return new OwnedCar(car.getModel(),car.getYear(),car.getEngine(),car.isAc(),Person.getRandomPerson());*/
		OwnedCar ownedCar = new OwnedCar(Car.randomCar());
		ownedCar.setOwner(Person.getRandomPerson());
		return ownedCar;
	} 
	
}
