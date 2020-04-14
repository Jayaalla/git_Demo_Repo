package JavaHackathon;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Input String");
	String inputstr = sc.nextLine();
	System.out.println("Enter the charecter to be removed");
	String str = sc.nextLine();
	inputstr = removeChar(inputstr,'o');
	System.out.println(inputstr);
	}
	private static String removeChar(String inputstr,char c) 
	{
		if(inputstr == null)
		{
			return null;
		}
		return inputstr.replaceAll(Character.toString(c),"");
	}
}
		
		

	

	


