package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import dto.Car;
import dto.Truck;

public class ComparableApp {

	public static void main(String[] args) {
		ArrayList<Car> garage = new ArrayList<>();
		
		garage.add(new Car("Zhiguli",1989,1.1,false));
		garage.add(new Car("Pobeda",1953,1.3,false));
		garage.add(new Car("Tavria",1987,0.7,true));
		garage.add(new Car("BMW",1992,2.3,true));
		garage.add(new Car("Ford",1933,0.8,false));
		garage.add(new Car("Dachia",1963,1.6,true));
		
		Collections.sort(garage,(Car c1, Car c2)->c1.getYear()-c2.getYear());
		
//		Collections.sort(garage,(Car c1, Car c2)->{ 
//			return c1.getYear()-c2.getYear();
//		});
		
		
		
		
		for(Car c:garage)System.out.println(c);
		System.out.println("======================");
		
		//ArrayList<Car> comfort = filter(garage,(c)->c.isAc());
		double min = 1.;
		min = 1.5;
		double min1 = min;
		ArrayList<Car> comfort = filter(garage,(c)->c.getEngine() > min1);
		
		for(Car c:comfort)System.out.println(c);
	/*	ArrayList<Truck> garage1 = new ArrayList<>();
		garage1.add(new Truck("Gaz",1987,5.8,false,15.));
		garage1.add(new Truck("Kamaz",1997,5.3,true,25.));
		garage1.add(new Truck("Belaz",1992,8.8,false,75.));
		
		Collections.sort(garage1);
		
		for(Truck t:garage1)System.out.println(t);*/
		
		
	
	}
	
	public static <T> ArrayList<T> filter(ArrayList<T> orig, Predicate<T> predicate) {
		ArrayList<T> result = new ArrayList<>();
		for (T t : orig) {
			if (predicate.test(t))
				result.add(t);
		}
		return result;
	}

}
