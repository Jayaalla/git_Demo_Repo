package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AppendToFileExample {

	public static void main(String[] args) {
		try {
	String data = "\nProgram to Append text to an Existing file";
	File f1 = new File("C:\\Users\\susmi\\eclipse-workspace\\JavaProject1\\text.txt");
	 if(!f1.exists())	{
		 f1.createNewFile();
		 }
		FileWriter fw = new FileWriter(f1.getName(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		System.out.println("Done");
		}
		catch(IOException e) {
			e.printStackTrace();}
		
		}

}

