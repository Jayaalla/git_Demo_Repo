package JavaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		int n,arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		n = sc.nextInt();
		 arr = new int[n];
		 System.out.println("Enter the "+n+" integers");
		 for(int i=0;i<n;i++)
			 arr[i] = sc.nextInt();
		 quicksort(arr,0,arr.length-1);
		 System.out.println("The Quick sorted integers");
		 System.out.println(Arrays.toString(arr));
	}
	public static void quicksort(int[] arr, int start,int end)
	{
		int partition = partition(arr,start,end);
		if(partition-1>start) {
	    quicksort(arr,start,partition-1);
		}
		if(partition+1<end) {
		quicksort(arr,partition+1,end);
		}
		}
	public static int partition(int[] arr,int start,int end)
	{
		int pivot = arr[end];
		for(int i=start;i<end;i++)
		{
			if(arr[i] < pivot)
			{
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
							
			}
		}
		
		int temp = arr[start];
		arr[start]= pivot;
		arr[end] = temp;
		return start;
	
	}

}
