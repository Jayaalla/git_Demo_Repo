package JavaTestPractice;
////A class for adding upto 3 numbers
 class OverLoading 
 { 
	 int add(int n1,int n2)
	 {
		 return n1+n2;
	 }
	int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}

public static void main(String args[])
{
  OverLoading obj = new OverLoading();
  System.out.println("Sum of two numbers:" +obj.add(20,30));
  System.out.println("Sum of three numbers:" +obj.add(20,30,40));
 }
}