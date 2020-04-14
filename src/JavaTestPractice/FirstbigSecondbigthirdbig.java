package JavaTestPractice;

import java.util.Scanner;

public class FirstbigSecondbigthirdbig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values ");
		int Arry[] =new int[5];
		int firstbig = 0;
		int secondbig = 0;
		int thirdbig = 0;
		for (int i=0;i<=Arry.length;i++)
		{
			Arry[i] = sc.nextInt(); 
			if(firstbig<Arry[i])
			{
				secondbig = firstbig;
				firstbig = Arry[i];
			}
			else if(secondbig < Arry[i]) 
				{
				thirdbig = secondbig;
				secondbig = Arry[i];
				}
			else  if(thirdbig< Arry[i])
			{
				thirdbig = Arry[i];
			}
		System.out.println(firstbig);	
			}
			}
		
		}


