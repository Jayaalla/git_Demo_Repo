package JavaHackathon;

import java.io.InputStream;
import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the string which want to check");
			String inputText = sc.next();
			checkInput(inputText);
		}catch(Exception e) {
		System.out.println(e.getMessage());	
		}
	}
	private static void checkInput(String inputText) {
		if(inputText == null || inputText.trim().isEmpty()){
			System.out.println("Enter Valid input text");
			return;
		}
    boolean isPalindrome = false;
    String reversedOutput = reverseInput(inputText);
    if(inputText.equalsIgnoreCase(reversedOutput))
    	isPalindrome = true;
    if(isPalindrome)
    System.out.println("Input String is  Palindrom");
    else
    System.out.println("Input string is not palindrome");	
	}
	private static String reverseInput(String inputText)
	{
		String reverse = " ";
		for(int i=inputText.length()-1;i>=0;i--)
		{	
					
	char c  = inputText.charAt(i);
	reverse = reverse+c;
		}

	return reverse;

}
}