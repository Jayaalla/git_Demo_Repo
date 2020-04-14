package JavaHackathon;

import java.util.Scanner;

public class IntStringOrBoolean {

			static boolean isNumber(String s) 
	    { 
	        for (int i = 0; i < s.length(); i++) 
	        if (Character.isDigit(s.charAt(i)) == false) 
	            return false; 
	  
	        return true; 
	    } 
	  
	        static public void main(String[] args) 
	    { 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Input");
	        String str = sc.nextLine();
	         // String str = "7777"; 
	        	//String str = "Hello";
	        System.out.print("The input is: ");	
	             if (isNumber(str)) 
	            System.out.println("Integer"); 
	  
	        else
	            System.out.println("String"); 
	          
	    } 
	} 

	


