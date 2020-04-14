package AbstractAndInterface;

interface WinOS
{
	public static final int a=20;
	public abstract void test1();
	void test2();
	
}
interface MosOS
{
	
	void test3();
}
interface LinuxOS
{
	
	void test4();
}


public class Demo3 implements WinOS,MosOS,LinuxOS {

	
	public void test4() {
		System.out.println("Test4 from Linox");
		
	}

		public void test3() {
		 System.out.println("Test3 from MacOS");
		
	}

	public void test1() {
		 System.out.println("Test1 from WinOS ");
		
		
	}
	
	public void test2() {
	     System.out.println("Test2 from WinOS ");
		
	}
	
	public static void main(String[] args)
	{
	Demo3 d2 = new Demo3();
	d2.test1();
	d2.test2();
	d2.test3();
	d2.test4();
	System.out.println(d2.a);
			
	}
}
