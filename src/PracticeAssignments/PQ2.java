package PracticeAssignments;
//Factorial of a number
import java.util.Scanner;

public class PQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
     System.out.println("The factorial of n is "+fact);
	}

}
