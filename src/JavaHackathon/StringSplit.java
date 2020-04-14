package JavaHackathon;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("returning words");
		for(String s:str.split("//s",0));
				
			{
			
			System.out.println(s);
		}
		System.out.println("returning words");
		{
			for(String s:str.split("\\s",1));
			System.out.println(s);
		}
		
		
		
		
		}
		
				

	}

}
