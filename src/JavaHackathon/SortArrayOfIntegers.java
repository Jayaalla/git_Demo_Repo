package JavaHackathon;

import java.util.Scanner;

public class SortArrayOfIntegers {
     //Ascending order
	public static void main(String[] args) {
		int n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of integers");
		n = sc.nextInt();
		int arry[] = new int[n];
		System.out.println("Enter the value for n:");
		for(int i=0;i<n;i++)
		{
			arry[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
	   for(int j=i+1; j<n;j++)
	   {
		  if (arry[i]>arry[j])
		  {
			  temp = arry[i];
			  arry[i] = arry[j];
			  arry[j] = temp;
		  }	  
	   }
	   
		}
	   System.out.println("Ascending Order");
	   
	   for(int i=0; i<=n-1;i++)
	   {
		   System.out.println(arry[i]);
	   }
	   System.out.print(arry[n-1]);
		}
	}
		
		
		


