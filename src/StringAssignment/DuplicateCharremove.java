package StringAssignment;

import java.util.Scanner;

//remove duplicate characters from string
public class DuplicateCharremove {

	
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
		if (flag == 2)
			array[i] = 0;
		System.out.print(array[i]);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("The string after removing the duplicate charecter:");
		counteachchar(str);
	}

}

	
	


