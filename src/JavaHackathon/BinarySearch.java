package JavaHackathon;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args)
	{
    int i,num,item,array[],first,last,middle;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of elements");
    num = sc.nextInt();
    array = new int[num];
    System.out.println("Enter "+num+" integer");
    for(i=0;i<num;i++)
       	array[i] = sc.nextInt();
    	System.out.println("Enter the search Value");
    	item = sc.nextInt();
    	first = 0;
    	last = num-1;
    	middle = (first+last)/2;
    	while(first<=last)
    	{
    	if(array[middle]<item) 
    	first = middle+1;
    	else if (array[middle]==item)
    	{	
    	System.out.println(item+" found at location " +(middle+1)+ " ");
    	break;
    	}
    	else
    	{
    	last = middle-1;
    	}
    	middle =(first+last)/2;
    	    	}
    	if(first>last)
    	System.out.println(item+" is not found");	
    	}
	}

    
