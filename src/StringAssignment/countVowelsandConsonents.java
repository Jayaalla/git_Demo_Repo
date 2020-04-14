package StringAssignment;

import java.util.Scanner;

//count the no of vowels & constants in a string.
public class countVowelsandConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.nextLine();
	str = str.toLowerCase();
	int vcount = 0;
	int ccount = 0;
	str = str.toLowerCase();
	for(int i=0;i<str.length();i++)
	{
	 char ch =str.charAt(i);
	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' )
	{
		vcount++;
	}	
    else 
     if ((ch>='a' && ch<='z'))
     {	
    	 ccount++;
     }
	}
    System.out.println("The count of the vowels in the string are: " +vcount);
    System.out.println("The count of consonents in the string are: " +ccount);	
	   
     }
}	
		
	
	
				

	


