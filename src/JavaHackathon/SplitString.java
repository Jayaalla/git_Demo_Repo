package JavaHackathon;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	String[] arrofstr = str.split("\\s");
	for(int i=0;i<arrofstr.length;i++)
	{
		System.out.println(arrofstr[i]);
	}
	
	}

	}


