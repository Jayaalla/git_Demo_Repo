package Assignments;
// Print Fibonacci series
public class AssigS3Q1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=1,b=1;
		n=0;
		System.out.println("1\n1");
		while(n<100)
		{
			n=a+b;
			System.out.println(n + " ");
			a=b;
			b=n;
		}

	}
}
