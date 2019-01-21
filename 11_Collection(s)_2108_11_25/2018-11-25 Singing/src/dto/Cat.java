package dto;

import interfaces.ISinging;

public class Cat implements ISinging{

	@Override
	public String sing() {
		return "Miew-miew";
	}

}
