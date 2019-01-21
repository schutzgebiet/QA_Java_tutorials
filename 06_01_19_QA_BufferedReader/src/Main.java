import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final String EXIT_STRING = "quit";
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Input something: ");
			String line = br.readLine();
			if(line.equalsIgnoreCase(EXIT_STRING))break;
			System.out.println(reverse(line));
		}
		System.out.println("bye!");	
	}
	
	public static String reverse(String str) {
		if(str == null) return null;
		String res = "";
		for(int i = 0; i<str.length();i++)res = str.charAt(i) + res;
		return res;
	}
}
