package dto;

import interfaces.ISinging;

public class Dog implements ISinging{

	@Override
	public String sing() {
		return "How-how";
	}

}
