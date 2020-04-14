package Assignments;

import java.util.Scanner;

//Check if number is positive or negative
public class AssigS2Q2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is positive.");
		}	
		else if(n<0)
		{
			System.out.println(n+" is negative");
		}
		else 
		{
		    System.out.println("The number is zero ");	
		}
		
}
}
