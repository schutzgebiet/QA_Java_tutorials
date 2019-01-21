package application;

import java.util.ArrayList;

import dto.*;
import interfaces.ISinging;

public class SingingApp {
	public static void main(String[] args) {
		ArrayList<ISinging> chorus = new ArrayList<>();
		chorus.add(new Dog());
		chorus.add(new Cat());
		chorus.add(new Fish());
		chorus.add(new Fly());
		sing(chorus);
	
	}
	
	public static void sing(ArrayList<ISinging> chorus) {
		for(ISinging singer : chorus)System.out.println(singer.sing());
	}
}
