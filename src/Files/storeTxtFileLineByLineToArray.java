package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class storeTxtFileLineByLineToArray {

	public static void main(String[] args) {
		File sPath = new File("C:\\Users\\susmi\\eclipse-workspace\\JavaProject1\\text.txt");
		StringBuilder sb = new  StringBuilder(); 
		String strLine = " ";
		List<String> list = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(sPath);
			BufferedReader br = new BufferedReader(fr);
			while (strLine !=null)
			{					
			strLine = br.readLine();
			sb.append(strLine);
			sb.append(System.lineSeparator());
			strLine = br.readLine();
			if(strLine == null)
				break;
			list.add(strLine);
					
		}
	System.out.println(Arrays.toString(list.toArray()));
	br.close();
	}catch(FileNotFoundException e) {
		System.err.println("File not found");
	}catch(IOException e) {
		System.out.println("unable to read the file");
	}
	}
}
