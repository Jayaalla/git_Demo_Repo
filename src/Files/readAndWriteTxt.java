package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class readAndWriteTxt {
	public static void main(String[] args) {
	String sPath ="C:\\Users\\susmi\\eclipse-workspace\\JavaProject1\\text.txt";
    String sPathToWrite = "C:\\Users\\susmi\\eclipse-workspace\\JavaProject1\\textWrite.txt";
    readTextFile(sPath);
	writeTextFile(sPathToWrite);
		}
	private static void writeTextFile(String sPath) {
		try {
		FileWriter fw = new FileWriter(sPath,true);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Hi");
		br.write("\nThis is Jayasree her");
		br.newLine();
		br.write("This is Jayasree here");
		br.close();
		}
		catch (Exception a) {
			System.out.println(a);
		}
		System.out.println("Success");
	}
   private static void readTextFile(String sPath) {
    	String sLine;
    	try {
    		FileReader fr = new FileReader(sPath);
    		BufferedReader br = new BufferedReader(fr);
    		while((sLine=br.readLine())!= null){
    			System.out.println(sLine);
    	
    			String reverse = " ";
		for(int i=sLine.length()-1;i>=0;i--)
		{
			reverse = reverse+sLine.charAt(i);
		}
		System.out.println("Reverse String is: ");
		System.out.println(reverse);	
    	 
    	 	//	if(sLine.contains("Jayasree")) {
    		//		System.out.println("I found");
    		//	}
    				
    			}
    		br.close();
    	}catch (Exception a) {
    		System.out.println(a);
    	}
    }
    		
    	}
    		
    	
    

