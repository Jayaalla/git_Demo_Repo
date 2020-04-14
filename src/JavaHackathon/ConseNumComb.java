package JavaHackathon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConseNumComb {
	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Enter the Number: ");
	int n = Integer.parseInt(br.readLine());
    int sum=0,c=0,j=0;
    for(int i=1;i<n;i++)
    {
    	sum =i;
    	j=i+1;
    	while(sum<n)
    	{
    		sum = sum + j;
    		j++;
    	}
    	if(sum==n)
    	{
    	for(int k=i;k<j;k++)
    	{
    	if(k== i)
    	System.out.print(k);	
    	else
    	System.out.print("+"+k);	
    	}
    	System.out.println();
    	}
    }
	}
    	}
    	
    	
    	
    	
    
	


