package StringAssignment;

import java.util.Scanner;

//count the occurrence of a given character in string.
public class CountofOccurance {
	
	static void counteachchar(String str)
	{
		int count[] = new int[256];
		int strlen = str.length();
	   for (int i=0;i<strlen;i++)
		count[str.charAt(i)]++;
	   char array[] = new char[str.length()];
		for(int i=0;i<strlen;i++)
		{
			array[i]=str.charAt(i);
			int flag = 0;
						
			for(int j=0;j<=i;j++)
			{
				if((str.charAt(i))==array[j])
					flag++;
			}
		if (flag == 1)
			System.out.println("The occurance of the charecter "
		    +str.charAt(i) +" in the string is:  " +count[str.charAt(i)]);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		counteachchar(str);
	}

}

