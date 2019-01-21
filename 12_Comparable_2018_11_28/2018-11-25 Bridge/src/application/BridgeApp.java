package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import comparator.CardComparator;
import dto.Card;

public class BridgeApp {
	
	public static ArrayList<String> suites = new ArrayList<>();

	public static void main(String[] args) {
		
		suites.add("spade  ");
		suites.add("club   ");
		suites.add("diamond");
		suites.add("heart  ");
		
		ArrayList<Card> deck = new ArrayList<>();
		for (int i=0; i<52; i++) deck.add(new Card(i));
		Collections.shuffle(deck);
		//for (int i=0; i<52; i++) System.out.println(deck.get(i));
		
		ArrayList<Card> east = new ArrayList<>();
		ArrayList<Card> south = new ArrayList<>();
		ArrayList<Card> west = new ArrayList<>();
		ArrayList<Card> north = new ArrayList<>();
		
		for (int i=0; i<52; i=i+4) {
			east.add(deck.get(i));
			south.add(deck.get(i+1));
			west.add(deck.get(i+2));
			north.add(deck.get(i+3));
		}
		
		Comparator<Card> c = new CardComparator();
		Collections.sort(east, c);
		Collections.sort(south, c);
		Collections.sort(west, c);
		Collections.sort(north, c);
			
		for (int i=0; i<13; i++)
			System.out.println(east.get(i)+"\t"+south.get(i)+"\t"+west.get(i)+"\t"+north.get(i));
		
		
	}

}
