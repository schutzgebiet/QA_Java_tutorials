package comparator;

import java.util.Comparator;

import application.BridgeApp;
import dto.Card;

public class CardComparator implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		int s1 = BridgeApp.suites.indexOf(c1.getSuit());
		int s2 = BridgeApp.suites.indexOf(c2.getSuit());
		
		if (s1 != s2) return s1-s2;
		
		int v1 = c1.getValue();
		int v2 = c2.getValue();
		
		v1 = v1 == 0 ? 13 : v1;
		v2 = v2 == 0 ? 13 : v2;
		
		return v1 - v2;

	}
}
