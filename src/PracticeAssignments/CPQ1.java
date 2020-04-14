package PracticeAssignments;

public class CPQ1 {
static int count = 0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		func();
		System.out.println(factorial(5));
	}
		static void func() {
			count++;
			if(count<=5) {
				System.out.println("Hello ::"+count);
				func();
			}
		}

	
  static int factorial(int n) {
	  if(n==1)
	    return 1;
	  else
		 return(n*factorial(n-1));
  }
		  
	  }
  
