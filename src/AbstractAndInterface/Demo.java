package AbstractAndInterface;

 abstract class Demo1 {
       int a =20;
      void test() {  //implement method
      System.out.println("Implement method running");
    	  
}
     protected abstract void test1(); //unimplemented method or Abstract

}
 
 public class Demo extends Demo1
 {
     protected void test1()
      {
    	 System.out.println("Abstract method implemented and running"); 
      }
 
 public static void main(String[] args)
 {
	 Demo d = new Demo();
	 d.test1();
	 d.test();
	 System.out.println(d.a);
 }
 
 
 
  
 
 } 
    