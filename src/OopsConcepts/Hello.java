package OopsConcepts;

public class Hello{
	int a;
	static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h1 = new Hello();
		Hello h5 = new Hello();
		System.out.println("line 11 = " +h1.a);
		h5.a = 60;
		h1.a = 32;
		System.out.println("line 11 = " +h1.a);
		System.out.println("line 12 = " +h5.a);
		System.out.println("value of 1st B= " +b);
		int b=40;
		System.out.println("value of 2nd B= " +b);
		test();
			}

public static void test()
{
	int b=40;
	Hello h1 = new Hello();
	h1.a =50;
	System.out.println("line 25 = " +h1.a);
	System.out.println("Value of B  = "+b);
	System.out.println("My main method..");
}
}