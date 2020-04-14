package SeleniumPrerequisiteAssignment;

import java.util.Scanner;

//find the occurance of the number
public class Q10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
				int[] arr=new int[66];
		        int[] dup=new int[55];
	int n,i,j,cnt;
	System.out.print("Enter the size of Array");
	n=sc.nextInt();
		System.out.print("Enter the Elements in the Array");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		dup[i]=-1;
	}
	for(i=0;i<n;i++) {
		cnt=1;
		for(j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				cnt++;
				dup[j]=0;
			}
		}
		if(dup[i]!=0)
		{
			dup[i]=cnt;
		}
	}
	System.out.println("Duplicate Elements in Array");
	for(i=0;i<n;i++)
	{
		if(dup[i]!=0)
		{
			System.out.println("Number"+arr[i]+"Occou"+dup[i]+"Times");
		}
	}

	}

}
