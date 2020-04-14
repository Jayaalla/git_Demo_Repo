package StringAssignment;

import java.util.Scanner;

public class stringContainsdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
		String str = sc.nextLine();
	char[] ch=str.toLowerCase().toCharArray();
	int count = 0;
	for(int i=0;i<ch.length;i++)
	{
		if((int)ch[i]>=48 && (int)ch[i]<=56)
		{
			count++;
					}
	}
	

	if(count == ch.length)
     {
		System.out.println("The string has only digits");
     }
	else
	{
		System.out.println("The string has both digits and charecters");
     }
}
}