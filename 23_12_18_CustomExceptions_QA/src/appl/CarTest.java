package appl;

import exceptions.CarWrongDataException;
import model.Car;

public class CarTest {

	public static void main(String[] args) throws CarWrongDataException {
		
		Car car = new Car(null,1920,13,true);
		
		System.out.println(car);

	}

}
