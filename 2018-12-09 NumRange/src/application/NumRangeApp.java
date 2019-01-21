package application;

import java.util.Iterator;

import model.NumRange;
import model.WrongDataException;

public class NumRangeApp {

	public static void main(String[] args) throws WrongDataException {
		
		NumRange numRange = new NumRange(21, 29);
	/*	
		Iterator<Integer> it = numRange.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	 */
		for(Integer i : numRange) {
			System.out.print(i+"  ");
		}
	}

}
