package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import dto.Car;
import dto.Truck;

public class ComparableApp {

	public static void main(String[] args) {
		ArrayList<Car> garage = new ArrayList<>();
		
		garage.add(new Car("Zhiguli", 1983, 1.1, false));
		garage.add(new Car("Pobeda", 1953, 1.3, false));
		garage.add(new Car("Tavria", 1987, 0.7, true));
		garage.add(new Car("BMW", 1992, 2.3, true));
		garage.add(new Car("Ford-T", 1933, 0.8, false));
		garage.add(new Car("Dacia", 1963, 1.6, true));
		
		Collections.sort(garage, (c1, c2)->{
			return c1.getYear()-c2.getYear();
		});
		
		for(Car car : garage)System.out.println(car);
		
		double min = 1.;
		min = 1.5;
		double min1 = min;
		ArrayList<Car> comfort = filter(garage, (c)->c.getEngine() > min1);
		
		System.out.println("**********************");
		for(Car car : comfort)System.out.println(car);
		
		/*ArrayList<Truck> trucks = new ArrayList<>();
		
		trucks.add(new Truck("GAZ", 1987, 5.8, false, 15.));
		trucks.add(new Truck("KamAZ", 1997, 5.3, true, 25.));
		trucks.add(new Truck("BelAZ", 1992, 8.8, false, 75.));
		
		Collections.sort(trucks);
		
		for(Truck truck : trucks)System.out.println(truck);*/

	}
	
	public static <T> ArrayList<T> filter(ArrayList<T> orig, Predicate<T> predicate){
		ArrayList<T> result = new ArrayList<>();
		for(T t : orig) {
			if(predicate.test(t)) result.add(t);
		}
		return result;
	}

}
