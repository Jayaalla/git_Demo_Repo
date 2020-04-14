package Assignments;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int  ArrNum[] = {36,19,29,12,5};
	int temp ;
	for(int i=0;i<ArrNum.length-1;i++)
	{
	for(int j=0;j<ArrNum.length-1;j++)
	{
		if(ArrNum[j] < ArrNum[j+1])
		{		
		temp = ArrNum[j];
		ArrNum[j] = ArrNum[j+1];
		ArrNum[j+1] = temp;
	}	
	}
	}
	for(int i=0;i<ArrNum.length;i++)
	{
	System.out.println(ArrNum[i] + " ");
	
		}
	}
	}	

	

	
		

	


