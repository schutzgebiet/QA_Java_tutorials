
public class Calculator {
	
	public static int result(String operation,
			             int firstOperand,
			             int secondOperand) {
		switch(operation) {
			case "add" : return firstOperand+secondOperand;
			case "sub" : return firstOperand-secondOperand;
			case "mul" : return firstOperand*secondOperand;
			case "div" : return firstOperand/secondOperand;
		}
		return Integer.MIN_VALUE;
	}

}
