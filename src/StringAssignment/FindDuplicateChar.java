package StringAssignment;

import java.util.Scanner;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string");
     String str = sc.nextLine();
     sc.close();
       char[] chStr= str.toCharArray();
       int count = 0;
     for (int i=0;i<chStr.length-1;i++)
     {
   	 for(int j=i+1;j<chStr.length;j++)
   	 {
   		  if(chStr[i] == chStr[j])
   		 {
   		System.out.println("The duplicate charecters in the string are   "+chStr[j]);	 
   		  count ++;
   	      		 }
     }
     }
     
	}
	}
     
	



