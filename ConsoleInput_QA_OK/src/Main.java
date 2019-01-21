import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String getStringFromConsole() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}

	public static int getIntFromConsole() throws IOException {
		return Integer.parseInt(getStringFromConsole());
	}

	public static int getIntFromConsoleSafety() {
		int res;
		while (true) {
			try {
				res = getIntFromConsole();
				break;
			} catch (NumberFormatException | IOException e) {
				System.out.println("Wrong int!");
			}
		}
		return res;
	}

	public static void main(String[] args) {

		try {
			System.out.println("res: " + getStringFromConsole());
		} catch (IOException e) {

			e.printStackTrace();
		}

		int a = getIntFromConsoleSafety();
		int b = getIntFromConsoleSafety();

		System.out.println("a+b = " + (a + b));

		// System.our - stream from program to console - output stream
		// System.in - stream from console to program - input stream

//		
//		InputStreamReader isr = new InputStreamReader(System.in);// System.in eto potok
//		
//		BufferedReader br = new BufferedReader(isr);
//		
//		try {
//			String line = br.readLine();
//			System.out.println("Line: " + line);
//			
//		//	System.out.println("Input from read: " + ((char)(br.read())));
//			
//			String aStr = br.readLine();
//			String bStr = br.readLine();
//			System.out.println("Input a-" + aStr + "Input b -" + bStr);
//			int aNum= Integer.parseInt(aStr);
//			int bNum = Integer.parseInt(bStr);
//			
//			System.out.println("sum a+b =" + (aNum + bNum));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}catch(NumberFormatException ex) {
//			System.out.println(ex.getMessage());
//		}

	}

}
