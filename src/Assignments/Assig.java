package Assignments;
//Calculator using switch case
import java.util.Scanner;

public class Assig{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two inputs");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your calc method\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:c=a+b;
		System.out.println("The addition"+c);
		break;
		case 2:c=a-b;
		System.out.println("The Subtraction"+c);
		break;
		case 3:c=a*b;
		System.out.println("The Multiplication "+c);
		break;
		case 4:c=a/b;
		System.out.println("The Division"+c);
		break;
		default:
		System.out.println("nothing matched");	
		}
				
		}
	}



