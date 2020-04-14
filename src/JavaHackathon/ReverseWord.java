package JavaHackathon;

import java.util.Scanner;

public class ReverseWord {
	public static String reverseWord(String inputString)
	{
		String[] words = inputString.split("//s");
		String outputString = "";
		for(int i=words.length-1;i>=0;i--)
		{
			outputString = outputString+words[i]+" ";
		}
		return outputString;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the String to reverse the word");
		Scanner sc= new Scanner(System.in);
		String inputString = sc.nextLine();
		String outputString = reverseWord(inputString);
		System.out.println("Input String: " +inputString);
		System.out.println("Output String " +outputString);
		sc.close();
	}

}
