package OopsConcepts;
/*Can we overload static method.
 * Yes , We can overload static method in JAVA. IN terms of method overloading 
 * static method are just like normal methods and in order to overload static method
 * you need to provide another static method with same name but different argument list
 * (different method signature).*/
 
 //Program to show to can overload static method

public class StaticOverload {

	public static void main(String[] args) {
		greet("Jaya");//will call static method with one string argument
		greet("Jaya","Good Morning");//overloaded static method will be call
	
	}
//static method will be overloaded
	
	private static void greet(String name) {
		System.out.println("Hello" + name);
	
	}
//another static method which overloade above Hello method
//	This shows How we can overload static method in JAVA
	private static void greet(String name,String greeting) {
		System.out.println(greeting +" "+name);
	
}
}
