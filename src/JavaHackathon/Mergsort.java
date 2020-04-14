package JavaHackathon;

import java.util.Scanner;

public class Mergsort {
	private static final int IIndList_strat = 0;
	private static final int IstList_end = 0;
	public static void main(String[] args) {
	int temp;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number how many to be sorted");
    int n = sc.nextInt();
    int list[] = new int[n];
    System.out.println("Enter " +n+" number 1 by 1");
    for(int i=0;i<n;i++)
    {
    	int  num = sc.nextInt();
    	list[i]=num;
    }
    System.out.println("List before sorting");
    for(int i=0;i<list.length;i++)
    	System.out.println(list[i]+" ");
        System.out.println();
        mergsort(list,0,list.length-1);
        System.out.println("List after sorting");
        for(int i=0;i<list.length;i++)
        	System.out.println(list[i]+" ");
        System.out.println();
      }

	public static void mergsort(int list[],int low,int high)
	{
		if(low>=high)
		{
			return ;
		}
	int middle = (low+high)/2;
	mergsort(list,low,middle);
	mergsort(list,middle+1,high);
	merg(list,low,high, middle);
	}
	private static void merg(int list[],int low,int middle,int high)
	{
		int IsList_end = middle;
		int IIndlist_start = middle+1;
		int l = low;
	while((l<IstList_end)&&(IIndlist_start<=high))	
{
	if(list[low]<list[IIndlist_start])
	{
		low++;
	}
	else
	{
		int temp = list[IIndlist_start];
		for(int j=IIndList_strat-1;j>=low;j--)
	{
		list[j+1] = list[j];
	}
	list[low] =temp;
	low++;
	IsList_end++;
	IIndlist_start++;
	}
		
			}

	}	
	
}  
	
	


