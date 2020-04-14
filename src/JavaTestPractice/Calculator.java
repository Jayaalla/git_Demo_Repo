package JavaTestPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firat number");
 /*we are using double so that the user can use integer as well as 
  *float charecter. 
		 */
       num1 = sc.nextDouble();
       System.out.println("Enter the second number");
       num2 = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/)");
       char operator = sc.next().charAt(0);
       double output;
       
       switch(operator)
       {
       case '+':
    	   output = num1+num2;
           break;
       case '-':
    	   output = num1-num2;
           break;
        		   
       case '*':
    	   output = num1*num2;
           break;
       case '/':
    	   output = num1/num2;
           break;
       default:System.out.println("you have entered wrong operator");
       return;
       
       }  		   
    System.out.println(num1+" "+operator+" "+num2+" =" +output);   
  }

}


