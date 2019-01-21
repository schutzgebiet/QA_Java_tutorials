package dto;

import application.BridgeApp;

public class Card {
	
	public static String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private int num;
	
	private String suit;
	private int value;
	
	public Card(int num) {
		this.num = num;
		
		suit = BridgeApp.suites.get(num/13);
		value = num%13;
	}
	
	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}



	public String toString() {
		return suit+" "+values[value];
	}
	
	
	
	

}
