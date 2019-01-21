package fileread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileIO {
	
	private String nameOfFile;
	
	
		
	public FileIO(String nameOfFile) {
		super();
		this.nameOfFile = nameOfFile;
	}



	public void putDataInFile(String date) throws IOException {
		File file = new File(nameOfFile);
		if (!file.exists())
			file.createNewFile();

		PrintWriter pw = new PrintWriter(new FileWriter(file,true)); //add with true, to save file, or false to receive !
		pw.print(date);
		pw.close();
	}
	
	public void clean() throws IOException {
		File file = new File(nameOfFile);
		if (!file.exists())
			file.createNewFile();

		PrintWriter pw = new PrintWriter(new FileWriter(file)); //add with true, to save file, or false to receive !
		pw.print("");
		pw.close();
	}
}
