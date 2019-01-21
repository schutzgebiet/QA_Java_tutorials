import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static String getDataFromFile(String nameOfFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(nameOfFile));
		
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line = br.readLine()) !=null) {
			sb.append(line+"\n");
		//	System.out.println(line);
		}	
		br.close();
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(getDataFromFile("poem.txt"));

	}

}
