package Assignments;

import java.util.Scanner;

//Calculator using Switch case
public class AssigS2Q1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,result;
		System.out.println("Enter the two numbers: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		System.out.println("1.Addition\n2.Subtract\n3.Multiplication\n4.Division\nEnter a choice number:");
		int choice;
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:{
			result=add(num1,num2);
			System.out.println("Addition is "+result);
		break;
		}
		case 2:{
			result=sub(num1,num2);
		System.out.println("Subtraction is "+result);
		break;
		}
		case 3:{
			result=Mul(num1,num2);
			System.out.println("Multiplication is "+result);
		break;
		}
		case 4:result=div(num1,num2);
		System.out.println("Division is "+result);
		break;
		}
		}
	public static float add(float a,float b) {
		return a+b;
		}
	public static float sub(float a,float b) {
		return a-b;
	}
	public static float Mul(float a,float b) {
		return a * b;
	}
	public static float div(float a,float b) {
		if(b==0) {
			System.out.println("Division cannot take place when number 2 is 0");
			return 0;
		}else {
			return a/b;
			
		}
		}
}
