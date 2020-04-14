package StringAssignment;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Q.1 How to find duplicate characters in a String?
public class SP1 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		String str;
		int strlength;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		strlength = str.length();
		//System.out.println("The length of the string is:"+strlength);
	    Map<Character,Integer> CharMapCount = new HashMap<>();
	    for(int i=0;i<str.length();i++)
	    {
	    	Character Ch=str.charAt(i);
	    if(CharMapCount.containsKey(Ch))
	    {
	    	CharMapCount.put(Ch,CharMapCount.get(Ch)+1 );
	    }else {
	    	CharMapCount.put(Ch, 1);
	    }
	    }
	    
	    }
	

		
CharMapCount.forEach(key,value)
{
	int value;
	if(value >1) {
		char[] key;
		System.out.println(key);
	}
}
}



