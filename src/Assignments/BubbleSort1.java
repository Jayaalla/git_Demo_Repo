package Assignments;

import java.util.Scanner;
public class BubbleSort1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values: ");
	int arrA[] = new int[5];
	int temp  ;
	for(int i=0;i<5;i++)
	{
		arrA[i]=sc.nextInt();
	}
	for(int j=0;j<arrA.length-1;j++)
	{
		for(int i=0;i<(arrA.length-1-j);i++)
		{
			if(arrA[i]<arrA[i+1]);
			temp = arrA[i];
			arrA[i] = arrA[i+1];
			arrA[i+1] = temp;
		}	
	}
	

for(int i=0;i<arrA.length;i++)	
{
	System.out.println("arrA[" +i+ "] ="+arrA[i]);
}
}
}

