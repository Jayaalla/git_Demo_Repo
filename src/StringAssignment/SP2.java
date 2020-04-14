package StringAssignment;

import java.util.Scanner;

// program to to check if a string contains only digits.
public class SP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ;
		//int strlength;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		//strlength = str.length();
		//System.out.println("The length of the String is: ");
		if( str.matches("[0-9]+") && (str.length() > 0) )
				{
			System.out.println("The string contains digits");
				}
		else
		{
			System.out.println("The string does not contain digits");
			
		}	
		}
		
				

	}


