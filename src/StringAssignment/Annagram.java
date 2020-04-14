package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;

public static boolean Annagram(String str1,String str2) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String1");
	String str1 = sc.next();
	System.out.println("Enter the string2");
	String str2 = sc.next();
	if(str1.length() != str2.length() )
	{
	    return false;
		System.out.println("The two strings are not Annagrams");
	}

	char[] strArray1 = str1.toCharArray();
    char[] strArray2 = str2.toCharArray();
    
    Arrays.sort(strArray1);
    Arrays.sort(strArray2);
    
    String sortedStr1 = new String(strArray1);
    String sortedStr2 = new String(strArray2);
      
     If(sortedStr1.equals(sortedStr2))
    {
    	retun true;
    	System.out.println("The two strings are Annagrams");
    }
    else
    {
	return false;
	System.out.println("the two strings are not Annagrams");
    }
}
}  
}

	

