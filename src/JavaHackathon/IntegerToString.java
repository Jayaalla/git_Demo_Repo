package JavaHackathon;

import java.util.Scanner;

public class IntegerToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		sc.close();
		String str = String.valueOf(n);
		System.out.println("The String Value is: "+n);
		

	}

}
