package OopsConcepts;
/*When you create object which method is called internally?
 * When you create object constructor is called internally
 * Constructor is a block of code that initializes the newly created object.
 * A constructor resembles an instance method in Java bunt it's not a method as
 * it doesn't have a return type.In short constructor and method are different.
 * So constructor is not a type of method but it is kind of method.
 * 
 *
 *Example*/

public class Constructor {
	String name;
// Constructor
	Constructor(){
	this.name = "BegninnersBook.com";
}

	public static void main(String[] args) {
	  Constructor obj = new Constructor();
	  System.out.println(obj.name);

	}

}
