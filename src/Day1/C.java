package Day1;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A= ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B= ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Enter the name= ");
        String name=sc.next();
        sc.close();
        System.out.println("Hi "+name+" Addition of A "+a+" and B "+b+" is "+c);
	}

}
