package JavaHackathon;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	 int n = sc.nextInt();
	  int arry[] = new int[n];
	 int r,sum=0; 
	 int temp;
	 temp = arry[n-1];
	 while(arry[n-1]>0)
	 {
		 r = arry[n-1]%10;
		 sum = (sum*10)+r;
	 }
	 if(temp == sum)
	 System.out.println("Palindrome");
	 else
	System.out.println("not Palindrom");	
	 }
	
		}


