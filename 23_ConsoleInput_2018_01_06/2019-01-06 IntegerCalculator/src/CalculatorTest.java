import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class CalculatorTest {
	
	private static final String EXIT_STRING = "quit";
	private static final String CLEAR_STRING = "clear";

	public static void main(String[] args) throws IOException {
		HashSet<String> operations = new HashSet<>();
		operations.add("add");
		operations.add("sub");
		operations.add("mul");
		operations.add("div");
		
		HashMap<String,String> hmss = new HashMap<>();
		hmss.put("add", "plus");
		hmss.put("sub", "minus");
		hmss.put("mul", "multiplied by");
		hmss.put("div", "divided by");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String line = null;
			
			String operation = null;
			int firstOperand = 0;
			int secondOperand = 0;
			
			boolean quitFlag = false;
			boolean clearFlag = false;
			
			while(true) {
				System.out.println("Input operation code:\n\n"+
			                   "\taddition\t : 'add'\n"+
			                   "\tsubtraction\t : 'sub'\n"+
			                   "\tmultiplication\t : 'mul'\n"+
			                   "\tdivision\t : 'div'\n"+
			                   "\n\t'"+EXIT_STRING+"' to quit"+
			                   "\n\t'"+CLEAR_STRING+"' to begin again"
				);
				line = br.readLine();
				if (line.equalsIgnoreCase(EXIT_STRING)) {
					quitFlag = true;
					break;
				}
				
				if (operations.contains(line)) break;
			}
			if (quitFlag) break;
			operation = line;
			
			while(true) {
				System.out.println("\nInput first operand (must be integer)\n");
				line = br.readLine();
				if (line.equalsIgnoreCase(EXIT_STRING)) {
					quitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_STRING)) {
					clearFlag = true;
					break;
				}
				try {
					firstOperand = Integer.parseInt(line);
					break;
				} catch (NumberFormatException e) {}
			}
			if (quitFlag) break;
			if (clearFlag) continue;
			
			while(true) {
				System.out.println("\nInput second operand (must be integer)\n");
				line = br.readLine();
				if (line.equalsIgnoreCase(EXIT_STRING)) {
					quitFlag = true;
					break;
				}
				if (line.equalsIgnoreCase(CLEAR_STRING)) {
					clearFlag = true;
					break;
				}
				try {
					secondOperand = Integer.parseInt(line);
					if (!(operation.equals("div") && secondOperand == 0))break;
					System.out.println("\tdivide by zero!");
				} catch (NumberFormatException e) {}
			}
			if (quitFlag) break;
			if (clearFlag) continue;
			
			System.out.println(firstOperand+" "+hmss.get(operation)+" "+secondOperand +
					           " is equal to "+
					  Calculator.result(operation, firstOperand, secondOperand)+"\n"); 
		}
		
	}
	

}
