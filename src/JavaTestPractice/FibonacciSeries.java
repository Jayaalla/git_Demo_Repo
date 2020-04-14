package JavaTestPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
    int n=0,a=1,b=1;
    System.out.println("Fionacci Series");
    System.out.print("1 1" );
    while(n<100)
    {
    	n = a+b;
    	System.out.print(" "+n+" ");
    	a=b;
    	b=n;
    }
  
	}
}
