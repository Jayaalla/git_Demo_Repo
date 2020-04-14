package SeleniumPrerequisiteAssignment;

import java.util.Scanner;
//Reverse string without using reverse command
public class Q6 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		
		String str= "Hi I am Jayasree";
			int len = str.length();
		String rev = " ";
		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
					}
		System.out.println("The reverse string is:");
		System.out.println(rev);

	}

}
